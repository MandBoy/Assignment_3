package Models;

import javax.persistence.Entity;
import java.util.LinkedList;

@Entity
public class Student{
    private int id;
    private String name;
    private String email;
    private int semester;
    private Login login;
    private LinkedList<Klasse> klasser;

    public Student(){}
    public Student(int id, String name, String email, int semester, Login login, LinkedList<Klasse> klasser){
        this.id = id;
        this.name = name;
        this.email = email;
        this.semester = semester;
        this.login = login;
        this.klasser = klasser;
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
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public Login getLogin() {
        return login;
    }
    public void setLogin(Login login) {
        this.login = login;
    }
    public LinkedList<Klasse> getKlasser() {
        return klasser;
    }
    public void setKlasser(LinkedList<Klasse> klasser) {
        this.klasser = klasser;
    }
}
