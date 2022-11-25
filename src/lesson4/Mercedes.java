package lesson4;

public class Mercedes extends Car {
    protected String classType;

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    @Override
    public void ride() {
        System.out.println(classType+" "+name+" "+model+". "+maxSpeed+"km/h"+" from "+year+" "+volume+" volume. Car is riding");
    }
}
