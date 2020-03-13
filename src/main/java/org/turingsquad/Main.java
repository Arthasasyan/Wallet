package org.turingsquad;

import org.turingsquad.cards.BankCard;
import org.turingsquad.cards.ExpirationDate;
import org.turingsquad.cards.PaymentSystem;
import org.turingsquad.docs.PersonalDocument;
import org.turingsquad.docs.Sex;
import org.turingsquad.docs.rus.passports.CitizenPassport;
import org.turingsquad.docs.rus.passports.Passport;
import org.turingsquad.docs.rus.passports.PassportIssuePlace;
import org.turingsquad.wallets.CardWallet;
import org.turingsquad.wallets.DocumentWallet;
import org.turingsquad.wallets.Wallet;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Passport citizenPassport = CitizenPassport.builder()
                .sex(Sex.MALE)
                .placeOfBirth("SPb")
                .placeOfRegistration("SPb")
                .passportIssuePlace(new PassportIssuePlace("MVD", "780-002"))
                .issueDate(new Date(System.currentTimeMillis()))
                .personName("Alexander")
                .birthDate(new Date(System.currentTimeMillis()))
                .build();
        System.out.println(citizenPassport);
        BankCard card = BankCard.builder()
                .cardNumber("123")
                .cardholderName("Alexander")
                .expirationDate(new ExpirationDate(1, 22))
                .paymentSystem(PaymentSystem.MASTERCARD)
                .build();
        System.out.println(card);
        CardWallet cardWallet = new CardWallet();
        cardWallet.add(card);
        DocumentWallet documents = new DocumentWallet();
        documents.add(citizenPassport);
        Wallet wallet = new Wallet(cardWallet, documents);
        for(BankCard innerCard: cardWallet) {
            System.out.println(innerCard);
        }
        for(PersonalDocument document: documents) {
            System.out.println(document);
        }
    }
}