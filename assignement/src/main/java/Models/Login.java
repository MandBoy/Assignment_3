package Models;

import javax.persistence.Entity;

@Entity
public class Login{
    private String username;
    private String password;

    public void setUsername(){
        this.username = username;
    }
    public void setPassword(){
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
