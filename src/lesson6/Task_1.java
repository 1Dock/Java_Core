package lesson6;

public class Task_1 {
    public static void main(String[] args) {
        User a1 = new User("Olzhas", "Ainabek");
        User a2 = new User("Zhandos", "Ainabek");
        User a3 = new User("Aibek", "Smith");
        User a4 = new User("John", "Anton");
        User a5 = new User("Adliar", "Sahan");
        User a6 = new User("Ilyas", "Smith");
        User a7 = new User("John", "Smith");
        User a8 = new User("Timyr", "Islamgaliev");
        User a9 = new User("John", "Smith");
        User a10 = new User("Rayan", "Sabyt");

        User arrUsers[] = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};

        UserBeanImp users = new UserBeanImp(arrUsers);

        users.getAllUsers();
        users.getUsersByName("John");
        users.getUsersBySurname("Smith");
    }
}
