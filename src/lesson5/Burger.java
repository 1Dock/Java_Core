package lesson5;

public class Burger extends Food {
    int meatAmount;
    int meatType;

    public Burger() {
    }

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public double getCalories() {
        if (meatType == 1) {
            return meatAmount * 840;
        }
        return meatAmount * 560;
    }

    @Override
    public void getData() {
        System.out.println(name+": "+"meat amount: "+meatAmount+", meat type: "+meatType+";");
    }
}
