package lesson8;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WebSite web = new WebSite();

        User users[] = new User[5];

        for (int i = 0; i < users.length; i++) {
            System.out.println("SET NAME: ");
            String name = in.next();

            System.out.println("SET SURNAME: ");
            String surname = in.next();

            System.out.println("SET AGE: ");
            int age;
            try {
                age = in.nextInt();
            }
            catch (Exception e) {
                age = 0;
                in.next();
            }

            User user = new User(name, surname, age);

            web.addUser(user);
        }

        for (int i = 0; i < web.sizeOfStudents; i++) {
            System.out.println(web.users[i].getData());
        }
    }
}
