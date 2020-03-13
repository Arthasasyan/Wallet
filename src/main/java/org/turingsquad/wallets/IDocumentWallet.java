package org.turingsquad.wallets;

import org.turingsquad.docs.PersonalDocument;

import java.util.List;

public interface IDocumentWallet {
    List<PersonalDocument> getDocuments();
}
