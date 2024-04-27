package com.example.demoh2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepositry {
    private final JdbcTemplate jdbcTemplate;

    public MyRepositry(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createTable() {
        jdbcTemplate.execute("CREATE TABLE my_table (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255))");
    }

    public void insertData(String name) {
        jdbcTemplate.update("INSERT INTO my_table (name) VALUES (?)", name);
    }

    public List<String> getAllNames() {
        return jdbcTemplate.queryForList("SELECT name FROM my_table", String.class);
    }
    
    public String dumyy(){
        return "dummy";
    }
}
