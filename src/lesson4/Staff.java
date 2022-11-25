package lesson4;

public class Staff extends Users{
    private double salary;
    private String[] subjects = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(int id, String login, String password, String nominal, String surname, double salary) {
        super(id, login, password, nominal, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getIndexOfSubject() {
        return indexOfSubject;
    }
    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    public void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    public void showSubjects() {
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }

    @Override
    public void getData() {
        System.out.println("\t"+id+": login->"+login+"; password->"+password+"; fullname: "+nominal+" "+surname+" salary: "+salary+"$");
        showSubjects();
    }
}
