package lesson5;

public abstract class Food {
    abstract double getCalories();
    String name;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public void printCalories() {
        System.out.print(getCalories());
    }

    public void getData() {
        System.out.println(name);
    }
}
