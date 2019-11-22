package Models;

import javax.persistence.Entity;

@Entity
public class Login{
    private static String username;
    private String password;

    public Login(String username, String password){
        this.username = username;
        this.password = password;
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
