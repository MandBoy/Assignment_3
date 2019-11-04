package Controller;

import Services.CRUDServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController{
    @Autowired
    CRUDServices projectServices;

    @GetMapping("/Login")
    public String loginPage(){
        return "LoginPage";
    }


}
