package lesson6;

public class HRManagers implements Workers {
    int id;
    String fullName;
    int salary;

    public HRManagers() {
    }

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getWorkerData() {
        return id+". "+fullName+" salary: "+salary+"$";
    }

    public double getSalary() {
        return salary;
    }
}
