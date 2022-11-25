package lesson7;

public class ERPSystem{
    Student students[] = new Student[100];
    int sizeOfStudents = 0;

    public void addStudent(Student student) {
        this.students[sizeOfStudents] = student;
        sizeOfStudents++;
    }
}
