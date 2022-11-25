package lesson4;

public class Toyota extends Car {
    protected String manufacturer;

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    @Override
    public void ride() {
        System.out.println("from "+manufacturer+" "+name+" "+model+". "+maxSpeed+"km/h"+" from "+year+" "+volume+" volume. Car is riding");
    }
}
