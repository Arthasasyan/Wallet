package org.turingsquad.cards;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
