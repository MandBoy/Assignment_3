package Controller;

import Services.CRUDServices;
import Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
    @Autowired
    CRUDServices projectServices;

    @GetMapping("/Login")
    public String loginPage(){
        return "LoginPage";
    }
    @PostMapping
    public String login(String username, String password){
        LoginService.checkLogin(username, password);
        return "redirect:/mainPage";
    }
}
