package oop.library.verifone.model;

public final class ExpirationDate {
    private final int year;
    private final int month;

    public ExpirationDate(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
}
