package lesson3;

public class Task_3 {
    public static void main(String[] args) {
        Phone p1 = new Phone("Iphone", "14-proMAX", 2100, 512);
        Phone p2 = new Phone("redmi", "9s", 360, 64);
        Phone p3 = new Phone("HUAWEI", "XS2", 750, 256);
        Phone p4 = new Phone("Sony Xperia", "PRO-I", 1800, 512);
        Phone p5 = new Phone("POCO F4", "GT", 630, 256);
        Phone p6 = new Phone("Nokia", "3310", 100, 5);
        Phone p7 = new Phone("XIAOMI", "9 T-pro", 600, 64);
        Phone p8 = new Phone("Samsung Galaxy", "S22 Ultra", 1250, 512);
        Phone p9 = new Phone("HUAWEI", "P50", 1500, 512);
        Phone p10 = new Phone("HUAWEI", "XS2", 750, 256);

        Phone[] phones = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};

        for (int i = 0; i < phones.length; i++) {
            System.out.println("\t" + phones[i].getName() + " )  cotegory - " + phones[i].getCategory());
        }
    }
}
