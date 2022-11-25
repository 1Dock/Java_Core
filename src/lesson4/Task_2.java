package lesson4;

public class Task_2 {
    public static void main(String[] args) {
        Car a1 = new Car("Tesla1", "xx1x", 269, 2020, 804);
        Car a2 = new Car("Tesla2", "xx1x", 321, 2022, 74);
        Car a3 = new Car("Tesla3", "xx1x", 268, 2021, 164);

        Toyota b1 = new Toyota("Toyota1", "a2aa", 364, 2018, 778, "USA");
        Toyota b2 = new Toyota("Toyota2", "a2aa", 270, 2000, 40, "United Arabian Emirates");
        Toyota b3 = new Toyota("Toyota3", "a2aa", 120, 1999, 120, "Japan");

        Mercedes c1 = new Mercedes("Mercedes1", "bbb3", 269, 1998, 804, "E Class");
        Mercedes c2 = new Mercedes("Mercedes2", "bbb3", 321, 1999, 74, "S Class");
        Mercedes c3 = new Mercedes("Mercedes3", "bbb3", 268, 1992, 164, "M Class");

        Car cars[] = {a1, a2, a3, b1, b2, b3, c1, c2, c3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].ride();
        }
    }
}