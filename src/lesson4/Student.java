package lesson4;

public class Student extends Users {
    private double gpa;
    private String[] courses = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }

    public Student(int id, String login, String password, String nominal, String surname, double gpa) {
        super(id, login, password, nominal, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }

    public void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public void showCourses() {
        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }

    @Override
    public void getData() {
        System.out.println("\t"+id + ": login->" + login + "; password->" + password + "; fullname: " + nominal + " " + surname+" gpa: "+gpa);
        showCourses();
    }
}