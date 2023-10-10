package Practise_Java.Practice22;

public class Model {
    private double number, answer;
    private int calculation;
    private boolean changeable = false;

    public boolean isChangeable() {
        return changeable;
    }

    public void setChangeable(boolean changeable) {
        this.changeable = changeable;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void setCalculation(int calculation) {
        this.calculation = calculation;
    }

    public double getAnswer() {
        return answer;
    }

    public int getCalculation() {
        return calculation;
    }
}
