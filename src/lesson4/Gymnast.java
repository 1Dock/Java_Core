package lesson4;

public class Gymnast extends Sportsman {
    protected int height;
    protected int weight;
    protected String style;

    public Gymnast() {
        this.height = 0;
        this.weight = 0;
        this.style = "no style";
    }

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    public void play() {
        System.out.println(fullName+" "+age+"age "+height+"height "+weight+"kg "+style+" he(she) is from "+country);
    }
}