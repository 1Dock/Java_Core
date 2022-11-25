package lesson5;

public class Task_2 {
    public static void main(String[] args) {
        SphereGold a1 = new SphereGold(3);
        SphereGold a2 = new SphereGold(6);
        SphereGold a3 = new SphereGold(4);

        CubeGold b1 = new CubeGold(5);
        CubeGold b2 = new CubeGold(2);
        CubeGold b3 = new CubeGold(7);

        GoldShape goldShapes[] = {a1, a2, a3, b1, b2, b3};

        for (int i = 0; i < goldShapes.length; i++) {
            System.out.println("volume: "+goldShapes[i].getVolume()+" "+"price: "+goldShapes[i].getPrice()+"$");
        }
    }
}