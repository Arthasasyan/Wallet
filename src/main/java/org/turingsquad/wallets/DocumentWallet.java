package org.turingsquad.wallets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Delegate;
import org.turingsquad.docs.PersonalDocument;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class DocumentWallet implements IDocumentWallet, List<PersonalDocument> {
    @Delegate private List<PersonalDocument> documents;

    public DocumentWallet() {
        this.documents = new ArrayList<PersonalDocument>();
    }
}
