package Repositories.BackEnd;

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

    public List<Admin> fetchAllAdminList(){
        String sql = " SELECT * FROM  Admin";
        RowMapper<Admin> rowMapper = new BeanPropertyRowMapper<>(Admin.class);
        return template.query(sql, rowMapper);
    }

    public void readAdminById(int id){
        String sql = "SELECT * FROM Admin WHERE id=?";
        RowMapper<Admin> rowMapper = new BeanPropertyRowMapper<>(Admin.class);
        template.queryForObject(sql, rowMapper, id);
    }

    public void createAdmin(Admin admin){
        String sql = "INSERT INTO Admin(name, login) VALUES(?, ?";
        RowMapper<Admin> rowMapper = new BeanPropertyRowMapper<>(Admin.class);
        template.update(sql, rowMapper, admin.getName(), admin.getLogin());
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
