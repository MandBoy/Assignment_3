package Repositories;

import Models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/*
public class KlasseRepo{
    @Autowired
    JdbcTemplate template;

    public List<Class> fetchAllKlasse(){
        String sql = " SELECT * FROM  Klasse";
        RowMapper<Class> rowMapper = new BeanPropertyRowMapper<>(Class.class);
        return template.query(sql, rowMapper);
    }
    public void readAKlasseById(int id){
        String sql = "SELECT * FROM Class WHERE id=?";
        RowMapper<Class> rowMapper = new BeanPropertyRowMapper<>(Class.class);
        template.queryForObject(sql, rowMapper, id);
    }
    public void createClass(Klasse klasse){
        String sql = "INSERT INTO Class(name,teacher,description,requirements,minStudents,maxStudents,students) VALUES(?,?,?,?,?,?,?,?)";
        RowMapper<Class> rowMapper = new BeanPropertyRowMapper<>(Class.class);
        template.update(sql, rowMapper, class.getName(), admin.getLogin());
    }
    public void updateAdmin(Admin admin){
        String sql = "UPDATE Admin SET name=?, login=?";
        template.update(sql, admin.getName(), admin.getLogin());
    }
    public void deleteAdmin(int id){
        String sql = "DELETE FROM Admin WHERE id=?";
        template.update(sql, id);
    }
}
*/
