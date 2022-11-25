package lesson4;

public class Users {

    protected int id;
    protected String login;
    protected String password;
    protected String nominal;
    protected String surname;

    public Users() {
        this.id = -1;
        this.login = "user"+id;
        this.password = "user2022";
        this.nominal = "no name";
        this.surname = "no surname";
    }

    public Users(int id, String login, String password, String nominal, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.nominal = nominal;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNominal() {
        return nominal;
    }
    public void setNominal(String nominal) {
        this.nominal = nominal;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

        public void getData() {
            System.out.println("\t"+id+": login->"+login+"; password->"+password+"; fullname: "+nominal+" "+surname);
        }
}
