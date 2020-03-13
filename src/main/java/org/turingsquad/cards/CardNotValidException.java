package org.turingsquad.cards;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CardNotValidException extends Exception {
    public CardNotValidException(String text) {
        super(text);
    }
}
