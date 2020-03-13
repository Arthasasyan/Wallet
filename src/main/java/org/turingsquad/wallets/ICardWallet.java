package org.turingsquad.wallets;

import org.turingsquad.cards.BankCard;

import java.util.List;

public interface ICardWallet {
    List<BankCard> getCards();
}
