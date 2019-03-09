package main;

public class Dollar {

    public Dollar(int amount) {
        this.amount = amount;
    }

    private int amount;

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}