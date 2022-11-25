package lesson5;

public class ERPSystem{
    User memory[] = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User memory) {
        this.memory[sizeOfUsers] = memory;
        sizeOfUsers++;
    }

    public void printAllUsers() {
        for (int i = 0; i < memory.length; i++) {
            System.out.println(memory[i].getUserData());
        }
    }

    public void printAllStudents() {
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] instanceof Student) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printAllTeachers() {
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] instanceof Teacher) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printUser(int index) {
        System.out.println(sizeOfUsers > index ? memory[index].getUserData() : "No such user in this index");
    }
}
