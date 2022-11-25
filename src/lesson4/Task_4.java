package lesson4;

public class Task_4 {
    public static void main(String[] args) {
        Sportsman a1 = new Sportsman("sportsman1", 30, "kazakhstan");
        Sportsman a2 = new Sportsman("sportsman2", 25, "Russia");
        Sportsman a3 = new Sportsman("sportsman3", 27, "Ukrine");

        Gymnast b1 = new Gymnast("Gymnast1", 30, "kazakhstan", 180, 73, "aa1");
        Gymnast b2 = new Gymnast("Gymnast2", 20, "Russia", 190, 80, "a1a");
        Gymnast b3 = new Gymnast("Gymnast3", 27, "Ukrine", 200, 53, "1aa");

        Footballer c1 = new Footballer("Footballer1", 30, "kazakhstan", "vratar", "baab");
        Footballer c2 = new Footballer("Footballer2", 20, "Russia", "napadayshi", "abba");
        Footballer c3 = new Footballer("Footballer3", 27, "Ukrine", "zashita", "bbaa");

        Swimmer d1 = new Swimmer("Swimmer1", 30, "kazakhstan", "aa1", 3.4);
        Swimmer d2 = new Swimmer("Swimmer2", 20, "Russia", "a1a", 5.6);
        Swimmer d3 = new Swimmer("Swimmer3", 27, "Ukrine", "1aa", 5.3);

        Sportsman players[] = {a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3};

        OlympicGames m1 = new OlympicGames("Brazil", 2022, players);

        for (int i = 0; i < m1.sportsmansList.length; i++) {
            m1.sportsmansList[i].play();
        }
    }
}
