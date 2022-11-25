package lesson4;

public class Swimmer extends Sportsman {

    protected String style;
    protected double recordTime;

    public Swimmer() {
        this.style = "no style";
        this.recordTime = 0;
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    @Override
    public void play() {
        System.out.println("time: "+recordTime+"ms "+fullName+" "+age+"age "+style+" style "+"he(she) is from "+country);
    }
}
