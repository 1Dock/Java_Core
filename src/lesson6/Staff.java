package lesson6;

public class Staff implements Workers {
    int id;
    String name;
    String surname;
    int salary;

    public Staff() {
    }

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getWorkerData() {
        return id+". "+name+" "+surname+" salary: "+salary+"$";
    }

    public double getSalary() {
        return salary;
    }
}
