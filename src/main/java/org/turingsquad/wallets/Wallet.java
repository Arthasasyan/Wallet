package org.turingsquad.wallets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Delegate;

@Data
@AllArgsConstructor
public class Wallet implements ICardWallet, IDocumentWallet {
    @Delegate private ICardWallet cardWallet;
    @Delegate private IDocumentWallet documentWallet;
}
