package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        List<Student> studentsArray = new ArrayList<>();
        List<Staff> staffsArray = new ArrayList<>();

        int idStudents = 0;
        int idStaff = 0;

        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("\tPRESS [1] TO ADD STUDENT");
            System.out.println("\tPRESS [2] TO ADD STAFF");
            System.out.println();
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("\tPRESS [1] TO LIST STUDENTS");
            System.out.println("\tPRESS [2] TO LIST STAFF");
            System.out.println();
            System.out.println("PRESS [0] TO EXIT");
            System.out.println();

            int num1 = in.nextInt();

            if (num1 == 1) {
                System.out.println("\tPRESS [1] TO ADD STUDENT");
                System.out.println("\tPRESS [2] TO ADD STAFF");
                System.out.println();

                int num2 = in.nextInt();

                if (num2 == 1) {
                    System.out.println("insert login");
                    String login = in.next();
                    System.out.println("insert password");
                    String password = in.next();
                    System.out.println("insert nominal");
                    String nominal = in.next();
                    System.out.println("insert surname");
                    String surname = in.next();
                    System.out.println("insert gpa");
                    double gpa = in.nextDouble();

                    Student student = new Student(idStudents, login, password, nominal, surname, gpa);
                    idStudents++;

                    studentsArray.add(student);
                }
                else if (num2 == 2) {
                    System.out.println("insert login");
                    String login = in.next();
                    System.out.println("insert password");
                    String password = in.next();
                    System.out.println("insert nominal");
                    String nominal = in.next();
                    System.out.println("insert surname");
                    String surname = in.next();
                    System.out.println("insert salary");
                    double salary = in.nextDouble();

                    Staff staff = new Staff(idStaff, login, password, nominal, surname, salary);
                    idStaff++;

                    staffsArray.add(staff);
                }
            }
            else if (num1 == 2) {
                System.out.println("\tPRESS [1] TO LIST STUDENTS");
                System.out.println("\tPRESS [2] TO LIST STAFF");
                System.out.println();

                int num2 = in.nextInt();

                if (num2 == 1) {
                    for (int i = 0; i < studentsArray.size(); i++) {
                        studentsArray.get(i).getData();
                    }
                    System.out.println();
                }
                else if (num2 == 2) {
                    for (int i = 0; i < staffsArray.size(); i++) {
                        staffsArray.get(i).getData();
                    }
                    System.out.println();
                }
            }
            else if (num1 == 0) {
                break;
            }
            else {
                System.out.print("unknown command");
            }
        }
    }
}
