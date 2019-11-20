package Models;

import javax.persistence.Entity;

@Entity
public class Student{
    private int id;
    private String name;
    private String email;
    private int semester;
    private Login login;

    public Student(){}
    public Student(int id, String name, String email, int semester, Login login){
        this.id = id;
        this.name = name;
        this.email = email;
        this.semester = semester;
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
}
