package lesson5;

public class Chocolate extends Food {
    int weight;

    public Chocolate() {
    }

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public double getCalories() {
        return weight * 740;
    }

    @Override
    public void getData() {
        System.out.println(name+": weight: "+weight+";");
    }
}
