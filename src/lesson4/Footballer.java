package lesson4;

public class Footballer extends Sportsman {
    protected String position;
    protected String club;

    public Footballer() {
        this.position = "no position";
        this.club = "no club";
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    @Override
    public void play() {
        System.out.println(club+". "+fullName+" "+age+"age "+position+" he(she) is from "+country);
    }
}