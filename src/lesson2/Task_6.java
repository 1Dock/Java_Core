package lesson2;

public class Task_6 {
    public static void main(String[] args) {
        Player p1 = new Player(0, "Olzhas", "Ainabek", "sniper");
        Player p2 = new Player(1, "Zhandos", "Ainabek", "lurker");
        Player p3 = new Player(2, "Ilyas", "Zhuanyshev", "B defender");
        Player p4 = new Player(3, "Aibek", "Bagyt", "A defender");
        Player p5 = new Player(4, "Rayn", "Sabyt", "open frug");
        Player p6 = new Player(5, "Timur", "Yslamgalyev", "support");
        Player p7 = new Player(6, "Azamat", "Tolegenov", "toxic");
        Player p8 = new Player(7, "Amanzhan", "Jygytov", "lurker");
        Player p9 = new Player(8, "Via", "Adamo", "sniper");
        Player p10 = new Player(9, "Sanya", "S1mple", "B defender");

        Player[] comand1 = {p1, p2, p3, p4, p5};
        Player[] comand2 = {p6, p7, p8, p9, p10};

        Club NV = new Club("Navi", "UK", 23566, comand1);
        Club FT = new Club("fnatic", "US", 18895, comand2);

        Club[] clubs = {NV, FT};

        for (int i = 0; i < clubs.length; i++) {
            clubs[i].printClubData();
        }
    }
}
