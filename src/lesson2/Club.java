package lesson2;

public class Club {

    String name;

    String country;

    int ratingPoints;

    Player[] players;

    public Club() {
    }

    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData() {
        System.out.println(name + ". " + country + ". rating: " + ratingPoints + ".");

        for (int i = 0; i < players.length; i++) {
            System.out.println("\t" + players[i]);
        }

        System.out.println();
    }
}
