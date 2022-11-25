package lesson2;

public class Student {
//    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
//        this.id = 0;
        this.name = "NO NAME";
        this.surname = "NO SURNAME";
        this.gpa = 0;
    }

    public Student(/*int id, */String name, String surname, double gpa) {
//        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getData() {
        return /*"ID: " + id + "; " + */"NAME: " + name + "; " + "SURNAME: " + surname + "; " + "GPA: " + gpa + ";";
    }
}
