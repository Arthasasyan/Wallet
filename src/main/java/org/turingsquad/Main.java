package org.turingsquad;

import org.turingsquad.cards.ExpirationDate;
import org.turingsquad.cards.PaymentCard;
import org.turingsquad.cards.PaymentSystem;
import org.turingsquad.cards.bank.Bank;
import org.turingsquad.cards.bank.Operation;


public class Main {
    public static void main(String[] args) throws Exception {
        PaymentCard card1 = PaymentCard.builder()
                .cardNumber("123")
                .cardholderName("Alexander")
                .expirationDate(new ExpirationDate(1, 22))
                .paymentSystem(PaymentSystem.MASTERCARD)
                .balance(10)
                .build();
        System.out.println(card1.getBalance());
        PaymentCard card2 = PaymentCard.builder()
                .cardNumber("123")
                .cardholderName("Alexander")
                .expirationDate(new ExpirationDate(1, 22))
                .paymentSystem(PaymentSystem.MASTERCARD)
                .balance(20)
                .build();
        System.out.println(card2.getBalance());
        Bank bank = new Bank();
        Thread thread = new Thread(bank);
        thread.start();
        Operation operation = new Operation(card1, card2, 5);
        bank.process(operation);
        Thread.sleep(5);
        System.out.println(card1.getBalance());
        System.out.println(card2.getBalance());
    }
}