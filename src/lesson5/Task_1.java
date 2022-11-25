package lesson5;

public class Task_1 {
    public static void main(String[] args) {
        Chocolate a1 = new Chocolate("Snickers", 3);
        Chocolate a2 = new Chocolate("Twix", 2);

        Burger b1 = new Burger("Burger King", 2, 2);
        Burger b2 = new Burger("McDonalds", 3, 1);

        Coke c1 = new Coke("Coca Cola", 20, true);
        Coke c2 = new Coke("Fuse Tea", 5, false);

        Food arrFood[] = {a1, a2, b1, b2, c1, c2};

        int index = 0;
        double maxCalories = 0;

        for (int i = 0; i < arrFood.length; i++) {
            arrFood[i].getData();
            System.out.print(arrFood[i].name+" calories: ");
            arrFood[i].printCalories();
            System.out.println();
            System.out.println();

            if (maxCalories < arrFood[i].getCalories()) {
                maxCalories = arrFood[i].getCalories();
                index = i;
            }
        }

        System.out.println("the most high-calorie:");
        arrFood[index].getData();
        System.out.print(arrFood[index].name+" calories: ");
        arrFood[index].printCalories();
    }
}
