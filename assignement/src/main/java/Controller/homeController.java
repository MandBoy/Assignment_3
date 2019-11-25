package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController{
    @GetMapping("/LoginPage")
    public String LoginPage(){
        return "LoginPage";
    }
    //Login Username and Password should go

    @GetMapping("/TeacherPage")
    public String teacherPage(){
        return "TeacherPage";
    }

    @GetMapping("/AdminPage")
    public String adminPage(){
        return "AdminPage";
    }

    @GetMapping("/StudentPage")
    public String studentPage(){
        return "StudentPage";
    }

    @GetMapping("/UserPage")
    public String userPage(){
        return "UserPage";
    }
}
