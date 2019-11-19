package Models;

import javax.persistence.Entity;

@Entity
public class Teacher extends Person{
    private String email;

    public Teacher(){}
    public Teacher(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
