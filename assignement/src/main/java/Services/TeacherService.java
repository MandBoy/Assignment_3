package Services;

import Models.Teacher;
import Repositories.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeacherService{
    @Autowired
    TeacherRepo teacherRepo;

    public void createTeacher(Teacher teacher){
        teacherRepo.createTeacher(teacher);
    }
    public List<Teacher> getTeachers(){
        return teacherRepo.featchAllTeacher();
    }
    public Teacher readById(int id){
        return teacherRepo.readTeacherById(id);
    }
    public void updateTeacher(Teacher teacher){
        teacherRepo.updateTeacher(teacher);
    }
    public void deleteTeacher(int id){
        teacherRepo.deleteTeacher(id);
    }
}
