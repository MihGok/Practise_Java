package Practise_Java.Practice17_1;

public class Model {
    private String toOut = "Добро пожаловать в ";
    private int amount = 1;
    private int guess;

    public int getAmount() {
        return amount;
    }

    public int getGuess() {
        return guess;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public String getToOut() {
        return toOut;
    }
}