package lesson5;

public class SphereGold extends GoldShape {
    double radius;

    public SphereGold() {
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (double)(4 / 3) * 3.14 * Math.pow(radius, 3);
    }
}
