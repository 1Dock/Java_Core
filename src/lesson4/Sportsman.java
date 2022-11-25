package lesson4;

public class Sportsman {
    protected String fullName;
    protected int age;
    protected String country;

    public Sportsman() {
        this.fullName = "no name";
        this.age = 0;
        this.country = "no country";
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public void play() {
        System.out.println(fullName+" "+age+"age"+" he is from"+country);
    }
}
