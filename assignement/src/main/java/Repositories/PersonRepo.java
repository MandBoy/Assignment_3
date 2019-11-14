package Repositories;

import Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepo {
    @Autowired
    JdbcTemplate template;

    public List<Person> fetchAllPersonList(){
        String sql = " SELECT * FROM  Person";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        return template.query(sql, rowMapper);
    }

    public void readPersonById(int id){
        String sql = "SELECT * FROM PERSON WHERE id=?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        template.queryForObject(sql, rowMapper, id);
    }

    public void createPerson(Person person){
        String sql = "INSERT INTO Person(name, login) VALUES(?, ?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        template.update(sql, rowMapper, person.getName(), person.getLogin());
    }

    public void updatePerson(Person person){
        String sql = "UPDATE Person SET name=?, login=?";
        template.update(sql, person.getName(), person.getLogin());
    }

    public void deletePerson(int id){
        String sql = "DELETE FROM Person WHERE id=?";
        template.update(sql, id);
    }
}
