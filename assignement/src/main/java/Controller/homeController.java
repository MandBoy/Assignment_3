package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController{
    @GetMapping("/")
    public String LoginPage(){
        return "LoginPage";
    }
    //Login Username and Password should go

    @GetMapping("/TeacherPage")
    public String teacherPage(){
        return "TeacherPage";
    }
    @PostMapping("/TeacherPage")
    public String getTeacherPage(){
        return "redirect:/TeacherPage";
    }

    @GetMapping("/AdminPage")
    public String adminPage(){
        return "AdminPage";
    }
    @PostMapping("/AdminPage")
    public String getAdminPage(){
        return "redirect:/AdminPage";
    }

    /*
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
    */
}
