package Practise_Java.Practice4;

public enum Level {
    Summer(25),
    Winter(0),
    Autumn(10),
    Spring(15);
    private final int avTemperature;

    Level(int avTemperature) {
        this.avTemperature = avTemperature;
    }
    public int getAvTemperature() {
        return this.avTemperature;
    }
}
