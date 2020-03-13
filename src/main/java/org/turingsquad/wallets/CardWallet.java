package org.turingsquad.wallets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Delegate;
import org.turingsquad.cards.BankCard;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class CardWallet implements ICardWallet, List<BankCard> {
    @Delegate private List<BankCard> cards;

    public CardWallet() {
        this.cards = new ArrayList<BankCard>();
    }

}
