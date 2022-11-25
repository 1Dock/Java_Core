package lesson2;

public class Phone {
    String name;
    String model;
    int price;

    public Phone() {
        this.name = "no name";
        this.model = "no model";
        this.price = 0;
    }

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData() {
        return "name:" + name + ", " + "model: " + model + ", " + "price: " + price + "$;";
    }

}
