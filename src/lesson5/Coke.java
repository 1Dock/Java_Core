package lesson5;

public class Coke extends Food {
    double volumeLiters;
    boolean isSparkling;

    public Coke() {
    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getCalories() {
        if(isSparkling) {
            return volumeLiters * 400;
        }
        return volumeLiters * 100;
    }

    @Override
    public void getData() {
        System.out.println(name+": "+"volume liters: "+volumeLiters+", is sparkling: "+isSparkling+";");
    }
}