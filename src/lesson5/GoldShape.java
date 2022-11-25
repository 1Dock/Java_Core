package lesson5;

public abstract class GoldShape {
    abstract double getVolume();

    public double getPrice() {
        return getVolume() * 250 + 1200;
    }
}
