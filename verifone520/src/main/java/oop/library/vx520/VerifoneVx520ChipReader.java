package oop.library.vx520;

import oop.library.verifone.model.Card;
import oop.library.verifone.model.EntryMode;
import oop.library.verifone.model.ExpirationDate;

public class VerifoneVx520ChipReader {

    public Card readCard() {

        return new Card("4558211532252558", new ExpirationDate(2025, 10), EntryMode.INSERTED);
    }

}
