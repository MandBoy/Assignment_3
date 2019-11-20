package Models;

import javax.persistence.Entity;

@Entity
public class Login{
    private int id;
    private static String username;
    private String password;

    public Login(int id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static String getUsername() {
        return username;
    }
    public static void setUsername(String username) {
        Login.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
