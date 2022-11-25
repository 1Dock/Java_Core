package lesson6;

public class Programmers implements Workers {
    int id;
    String nickname;
    double salary;
    double bonusSalary;
    double KPIValue;

    public Programmers() {
    }

    public Programmers(int id, String nickname, double salary, double bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public String getWorkerData() {
        return id+". "+nickname+" salary: "+salary+"$ + bonus: "+bonusSalary+" + KPI: "+KPIValue;
    }

    public double getSalary() {
        return salary + KPIValue * bonusSalary;
    }
}
