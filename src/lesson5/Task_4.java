package lesson5;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ERPSystem college = new ERPSystem();

        int idStudent = 0;
        int idTeacher = 0;

        while (true) {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");

            int num1 = in.nextInt();

            if (num1 == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");

                int num2 = in.nextInt();

                if (num2 == 1) {
                    System.out.print("Login: ");
                    String login = in.next();
                    System.out.print("Password: ");
                    String password = in.next();
                    System.out.print("Name: ");
                    String name = in.next();
                    System.out.print("Surname: ");
                    String surname = in.next();
                    System.out.print("Group: ");
                    String group = in.next();
                    System.out.print("GPA: ");
                    int gpa = in.nextInt();

                    Student student = new Student(idStudent, login, password, name, surname, group, gpa);
                    idStudent++;

                    college.addUser(student);
                }
                else if (num2 == 2) {
                    System.out.print("Login: ");
                    String login = in.next();
                    System.out.print("Password: ");
                    String password = in.next();
                    System.out.print("NickName: ");
                    String nickName = in.next();
                    System.out.print("Status: ");
                    String status = in.next();

                    Teacher teacher = new Teacher(idStudent, login, password, nickName, status);
                    idTeacher++;

                    college.addUser(teacher);

                    while (true) {
                        System.out.println("PRESS [1] TO ADD SUBJECT");
                        System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");

                        int num3 = in.nextInt();

                        if (num3 == 1) {
                            System.out.println("ENTER SUBJECT: ");
                            String subject = in.next();

                            teacher.addSubject(subject);
                        }
                        else if (num3 == 0) {
                            break;
                        }
                    }
                }
            }
            else if (num1 == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");

                int num4 = in.nextInt();

                if (num4 == 1) {
                    college.printAllStudents();
                }
                else if (num4 == 2) {
                    college.printAllTeachers();
                }
            }
            else if (num1 == 3) {
                System.out.print("ENTER INDEX: ");
                int index = in.nextInt();

                college.printUser(index);
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