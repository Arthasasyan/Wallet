package org.turingsquad.cards;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.text.ParseException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class PaymentCard extends BankCard {
    @Getter
    private long balance;

    @Getter
    @Builder.Default
    private Lock balanceLock = new ReentrantLock();

    public void withdraw(long amount) {
        if(this.balance - amount < 0) {
            throw new NotEnoughMoneyException();
        }
        this.balance -= amount;
    }

    public void add(long amount) {
        this.balance += amount;
    }

    public boolean isValid() {
        try {
            return this.getExpirationDate().toDate().getTime() > System.currentTimeMillis();
        } catch (ParseException e) {
            return false;
        }
    }
}
