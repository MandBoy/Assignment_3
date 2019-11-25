package Services;

import Models.Student;
import Repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService{

    @Autowired
    StudentRepo studentRepo;

    public List<Student> fetchAllStudents(){
        return studentRepo.fetchAllStudents();
    }
    public void deleteStudent(int id){
        studentRepo.deleteStudent(id);
    }
    public void createStudent(Student student){
        studentRepo.createStudent(student);
    }
    public void updateStudent(Student student){
        studentRepo.updateStudent(student);
    }
    public Student readStudentById(int id){
        return studentRepo.readStudentById(id);
    }


}
