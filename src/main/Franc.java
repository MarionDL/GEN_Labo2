package main;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
}