package Repositories;

import Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    @Autowired
    JdbcTemplate template;

    String sql;
    RowMapper<Student> rowMapper = new BeanPropertyRowMapper<>(Student.class);

    public List<Student> fetchAllStudents(){
        sql = "SELECT * FROM  Student";
        return template.query(sql, rowMapper);
    }

    public Student readStudentById(int id){
        sql = "SELECT * FROM Student WHERE id=?";
        return template.queryForObject(sql, rowMapper, id);
    }

    public void createStudent(Student student){
        sql = "INSERT INTO Student(name, email, semester, login) VALUES(?, ?, ?, ?)";
        template.update(sql, rowMapper, student.getId(), student.getName(), student.getSemester(), student.getLogin());
    }

    public void updateStudent(Student student){
        sql = "UPDATE Student SET name=?, SET email=?, SET login=? ";
        template.update(sql, student.getId(), student.getName(), student.getSemester(), student.getLogin());
    }

    public void deleteStudent(int id){
        sql = "DELETE FROM Student WHERE id=?";
        template.update(sql, id);
    }


}
