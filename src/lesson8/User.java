package lesson8;

public class User {
    String name;
    String surname;
    int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getData() {
        return name+" "+surname+" age: "+age+";";
    }
}
