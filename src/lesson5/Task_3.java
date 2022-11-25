package lesson5;

public class Task_3 {
    public static void main(String[] args) {
        FerrariEngine a1 = new FerrariEngine(20, 43, 19);
        FerrariEngine a2 = new FerrariEngine(60, 56, 28);
        FerrariEngine a3 = new FerrariEngine(55, 78, 37);
        FerrariEngine a4 = new FerrariEngine(42, 9, 46);
        FerrariEngine a5 = new FerrariEngine(83, 12, 55);

        RenaultEnigine b1 = new RenaultEnigine(20.6, 43, 19.4, 4.6);
        RenaultEnigine b2 = new RenaultEnigine(60.3, 56, 28.7, 78.3);
        RenaultEnigine b3 = new RenaultEnigine(55.5, 78, 37.2, 2.4);
        RenaultEnigine b4 = new RenaultEnigine(42.1, 9, 46.3, 56.4);
        RenaultEnigine b5 = new RenaultEnigine(83.8, 12, 55.5, 67.3);

        Engine[] engines = {a1, a2, a3, a4, a5, b1, b2, b3, b4, b5};

        for (int i = 0; i < engines.length; i++) {
            System.out.println(i + ". max speed: "+engines[i].getMaxSpeed() + "km/h");
        }
    }
}
