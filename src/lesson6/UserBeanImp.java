package lesson6;

public class UserBeanImp implements UserBean {
    User[] users;

    public UserBeanImp(User[] users) {
        this.users = users;
    }

    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getData());
        }
        System.out.println();
    }

    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].name == name) {
                System.out.println(users[i].getData());
            }
        }
        System.out.println();
    }

    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].surname == surname) {
                System.out.println(users[i].getData());
            }
        }
        System.out.println();
    }
}
