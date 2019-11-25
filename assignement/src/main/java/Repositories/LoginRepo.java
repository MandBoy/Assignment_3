package Repositories;

import Models.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class LoginRepo{
    @Autowired
    JdbcTemplate template;

    String sql;
    RowMapper<Login> rowMapper = new BeanPropertyRowMapper<>(Login.class);

    public void loginCheck(String username, String password){
        sql = "SELECT * FROM Login WHERE username=? AND password=?";
        template.queryForObject(sql,rowMapper,username, password);
    }
}
