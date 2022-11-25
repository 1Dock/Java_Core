package lesson4;

public class Car {
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car() {
        this.name = "no name";
        this.model = "no model";
        this.maxSpeed = 0;
        this.year = 0;
        this.volume = 0;
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public void ride() {
        System.out.println(name+" "+model+". "+maxSpeed+"km/h"+" from "+year+" "+volume+" volume. Car is riding");
    }
}
