package Repositories;

import Models.Klasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class KlasseRepo{
    @Autowired
    JdbcTemplate template;

    String sql;
    RowMapper<Klasse> rowMapper = new BeanPropertyRowMapper<>(Klasse.class);

    public List<Klasse> fetchAllKlasse(){
        sql = " SELECT * FROM Klasse";
        return template.query(sql, rowMapper);
    }
    public Klasse readKlasseById(int id){
        sql = "SELECT * FROM Class WHERE id=?";
        return template.queryForObject(sql, rowMapper, id);
    }
    public void createClass(Klasse klasse){
        sql = "INSERT INTO Klasse(name,teacher,description,requirements,minStudents,maxStudents,students) VALUES(?,?,?,?,?,?,?)";
        template.update(sql, rowMapper,klasse.getName(),klasse.getTeacher(),klasse.getDescription(),klasse.getRequirements(),klasse.getMinStudents(),klasse.getMaxStudents(),klasse.getStudents());
    }
    public void updateKlasse(Klasse klasse){
        sql = "UPDATE Klasse SET name=?, Klasse=?";
        template.update(sql, klasse.getName(),klasse.getTeacher(),klasse.getDescription(),klasse.getRequirements(),klasse.getMinStudents(),klasse.getMaxStudents(),klasse.getStudents());
    }
    public void deleteKlasse(int id){
        String sql = "DELETE FROM Klasse WHERE id=?";
        template.update(sql, id);
    }
}


