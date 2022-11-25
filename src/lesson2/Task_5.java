package lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        List<Student> studentsArray = new ArrayList<>();

        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");

            int num = in.nextInt();

            if (num == 1) {
                System.out.println("Insert name?");
                String name = in.next();
                System.out.println("Insert surname?");
                String surname = in.next();
                System.out.println("Insert GPA?");
                double gpa = in.nextDouble();

                Student student = new Student(name, surname, gpa);
                studentsArray.add(student);
            }
            else if (num == 2) {
                for (int i = 0; i < studentsArray.size(); i++) {
                    System.out.println(studentsArray.get(i).getData());
                }
            }
            else if (num == 0) {
                System.out.print("bye :-)");
                break;
            }
            else {
                System.out.print("unknown command :-(");
            }
        }
    }
}
