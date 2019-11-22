package Repositories;

import Models.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class LoginRepo{
    @Autowired
    JdbcTemplate template;

    public List<Login> fetchAllLogins(){
        String sql = "SELECT * FROM  Login";
        RowMapper<Login> rowMapper = new BeanPropertyRowMapper<>(Login.class);
        return template.query(sql, rowMapper);
    }
    public void readLoginById(int id){
        String sql = "SELECT * FROM Login WHERE id=?";
        RowMapper<Login> rowMapper = new BeanPropertyRowMapper<>(Login.class);
        template.queryForObject(sql, rowMapper, id);
    }
    public void createLogin(Login login){
        String sql = "INSERT INTO Login(name, login) VALUES(?, ?)";
        RowMapper<Login> rowMapper = new BeanPropertyRowMapper<>(Login.class);
        template.update(sql, rowMapper, login.getUsername(), login.getPassword());
    }
    public void updateLogin(Login login){
        String sql = "UPDATE Login SET name=?, login=?";
        template.update(sql, login.getUsername(), login.getPassword());
    }
    public void deleteLogin(int id){
        String sql = "DELETE FROM Login WHERE id=?";
        template.update(sql, id);
    }
    public void checkLogin(String username, String password){
        String sql = "SELECT Username FROM Login";
        RowMapper<Login> rowMapper = new BeanPropertyRowMapper<>(Login.class);
        template.query(sql,rowMapper);
    }
}