package main;

public class Franc {

    public Franc(int amount) {
        this.amount = amount;
    }

    private int amount;

    public Franc times(int multiplier) {

        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}