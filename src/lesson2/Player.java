package lesson2;

public class Player {

    int number;
    String name;
    String surname;
    String position;

    public Player() {
        this.number = 0;
        this.name = "no name";
        this.surname = "no surname";
        this.position = "no position";
    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString() {
        return number + ". " + name + " " + surname + ". position: " + position;
    }

}
