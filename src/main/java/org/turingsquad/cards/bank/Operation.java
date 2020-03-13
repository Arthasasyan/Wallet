package org.turingsquad.cards.bank;

import lombok.Data;
import org.turingsquad.cards.CardNotValidException;
import org.turingsquad.cards.PaymentCard;

import java.util.concurrent.locks.Lock;

@Data
public class Operation {
    private final PaymentCard from;
    private final PaymentCard to;
    private final long amount;

    public Operation(PaymentCard from, PaymentCard to, long amount) throws CardNotValidException {
        if (!from.isValid()) {
            throw new CardNotValidException(String.format("Card %s not valid", from.getCardNumber()));
        }
        if (!to.isValid()) {
            throw new CardNotValidException(String.format("Card %s not valid", to.getCardNumber()));
        }
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        Lock fromLock = this.from.getBalanceLock();
        Lock toLock = this.to.getBalanceLock();

        while (true) {
            if (fromLock.tryLock()) {
                if (toLock.tryLock()) {
                    try {
                        from.withdraw(amount);
                        to.add(amount);
                        return;
                    } finally {
                        fromLock.unlock();
                        toLock.unlock();
                    }
                }
                else {
                    fromLock.unlock();
                }
            }
        }
    }
}
