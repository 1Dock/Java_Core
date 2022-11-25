package lesson3;

public class Phone {

    private String name;
    private String model;
    private int price;
    private int memory;

    public Phone() {
    }

    public Phone(String name, String model, int price, int memory) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 500 || price > 1000) {
            this.price = price;
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getCategory() {
        if (price > 1000) {
            return "ТОП";
        }

        return "SIMPLE";
    }
}
