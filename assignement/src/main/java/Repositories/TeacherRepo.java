package Repositories;

import Models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherRepo{
    @Autowired
    JdbcTemplate template;

    String sql;
    RowMapper<Teacher> rowMapper = new BeanPropertyRowMapper<>(Teacher.class);

    public List<Teacher>featchAllTeacher(){
        sql = "SELECT * FROM Teacher";
        return template.query(sql,rowMapper);
    }
    public void ReadTeacherById(int id){
        sql = "SELECT * FROM Teacher WHERE id=?";
        template.queryForObject(sql, rowMapper, id);
    }
    public void createTeacher(Teacher teacher){
        sql = "INSERT INTO Teacher(name, email, login) VALUES (?,?,?)";
        template.update(sql,rowMapper,teacher.getName(),teacher.getEmail(),teacher.getLogin());
    }
    public void updateTeacher(Teacher teacher){
        sql = "UPDATE Teacher SET name=?, Teacher=?";
        template.update(sql,teacher.getName(),teacher.getEmail(),teacher.getLogin());
    }
    public void deleteTeacher(int id){
        sql = "DELETE FROM Teacher WHERE Id=?";
        template.update(sql,id);
    }




}
