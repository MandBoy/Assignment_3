package Controller;

import Models.Admin;
import Models.Student;
import Models.Teacher;
import Repositories.TeacherRepo;
import Services.AdminService;
import Services.KlasseService;
import Services.StudentService;
import Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController{
    @Autowired
    TeacherService teacherService;
    AdminService adminService;
    StudentService studentService;
    KlasseService klasseService;

    @GetMapping("/LoginPage")
    public String LoginPage(){
        return "LoginPage";
    }

    @GetMapping("/TeacherPage")
    public String teacherPage(){
        return "TeacherPage";
    }
    @PostMapping("/CreateTeacher")
    public void createTeacher(@ModelAttribute Teacher teacher){
        teacherService.createTeacher(teacher);
    }
    @GetMapping("/AdminPage")
    public String adminPage(){
        return "AdminPage";
    }
    @PostMapping("/CreateAdmin")
    public void createAdmin(@ModelAttribute Admin admin){
        adminService.createAdmin(admin);
    }
    @GetMapping("/StudentPage")
    public String studentPage(){
        return "StudentPage";
    }
    @PostMapping("CreateStudent")
    public void createStudent(@ModelAttribute Student student){
        studentService.createStudent(student);
    }

    @GetMapping("/UserPage")
    public String userPage(){
        return "UserPage";
    }
}
