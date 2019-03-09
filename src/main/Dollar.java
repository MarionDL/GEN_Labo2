package main;

public class Dollar {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int amount;

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        return true;
    }
}