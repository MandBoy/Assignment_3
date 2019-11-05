package Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person{
    @Id
    private int id;
    private String name;
    private Login login;

    public Person(){}
    public Person(int id, String name){
        this.id = id;
        this.name = name;
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
    public Login getLogin() {
        return login;
    }
    public void setLogin(Login login) {
        this.login = login;
    }
}
