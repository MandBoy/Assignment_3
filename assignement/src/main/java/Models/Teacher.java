package Models;

import javax.persistence.Entity;

@Entity
public class Teacher{
    private int id;
    private String name;
    private String email;
    private Login login;

    public Teacher(){}
    public Teacher(int id, String name, String email, Login login){
        this.id = id;
        this.name = name;
        this.email = email;
        this.login = login;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Login getLogin() {
        return login;
    }
    public void setLogin(Login login) {
        this.login = login;
    }
}
