package Controller;

import Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController{
    @Autowired
    @GetMapping("")
    public String loginPage(){
        return "LoginPage";
    }

    @PostMapping
    public String login(String username, String password){
        boolean exists = LoginService.checkLogin(username, password);
        if(exists){
            return "redirect:/MainPage";
        }
        else{
            System.out.println("Error: Wrong username or password.");
        }
        return "redirect:/LoginPage";
    }

    @GetMapping("/MainPage")
    public String mainPage(){
        return "MainPage";
    }
    @PostMapping("/MainPage")
    public String mainPageDirect(){
        return "redirect:/MainPage";
    }
}
