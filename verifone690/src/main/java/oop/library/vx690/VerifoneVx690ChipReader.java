package oop.library.vx690;

import oop.library.verifone.model.Card;
import oop.library.verifone.model.EntryMode;
import oop.library.verifone.model.ExpirationDate;

public class VerifoneVx690ChipReader {

    public Card readCard() {
        return new Card("4558211532252558", new ExpirationDate(12, 2028), EntryMode.INSERTED);
    }

}
