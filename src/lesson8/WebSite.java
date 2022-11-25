package lesson8;

public class WebSite {
    User users[] = new User[5];
    int sizeOfStudents = 0;
    public void addUser(User user) {
        this.users[sizeOfStudents] = user;
        sizeOfStudents++;
    }
}
