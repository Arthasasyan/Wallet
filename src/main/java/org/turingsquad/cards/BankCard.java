package org.turingsquad.cards;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BankCard {
    private final String cardNumber;
    private final ExpirationDate expirationDate;
    private final String cardholderName;
    private final PaymentSystem paymentSystem;
}
