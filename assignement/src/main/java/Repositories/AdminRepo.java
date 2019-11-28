package Repositories;

import Models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminRepo{
    @Autowired
    JdbcTemplate template;

    String sql;
    RowMapper<Admin> rowMapper = new BeanPropertyRowMapper<>(Admin.class);

    public List<Admin> fetchAllAdmin(){
        sql = " SELECT * FROM  Admin";
        return template.query(sql, rowMapper);
    }
    public Admin readAdminById(int id){
        sql = "SELECT * FROM Admin WHERE id=?";
        return template.queryForObject(sql, rowMapper, id);
    }
    public void createAdmin(Admin admin){
        sql = "INSERT INTO Admin(name, login) VALUES(?, ?)";
        template.update(sql, rowMapper, admin.getName(), admin.getLogin());
    }
    public void updateAdmin(Admin admin){
        sql = "UPDATE Admin SET name=?, login=?";
        template.update(sql, admin.getName(), admin.getLogin());
    }
    public void deleteAdmin(int id){
        sql = "DELETE FROM Admin WHERE id=?";
        template.update(sql, id);
    }
}
