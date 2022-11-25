package lesson2;

public class Task_2 {
    public static void main(String[] args) {
        Phone h1 = new Phone("iphone", "13-S pro", 3590000);
        System.out.println(h1.getData());

        Phone h2 = new Phone("nokia", "33010", 100);
        System.out.println(h2.getData());

        Phone h3 = new Phone("xiomi", "9s", 300);
        System.out.println(h3.getData());

        Phone h4 = new Phone("redmi", "10s-pro", 500);
        System.out.println(h4.getData());

        Phone h5 = new Phone("rog-phone", "gm-501", 50000);
        System.out.println(h5.getData());

        Phone h6 = new Phone("samsung", "s10", 400);
        System.out.print(h6.getData());
    }
}
