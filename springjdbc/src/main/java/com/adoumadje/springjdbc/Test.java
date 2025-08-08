package com.adoumadje.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        String config = "config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = """
                INSERT INTO employee
                VALUES (?, ?, ?)
                """;
        int res = jdbcTemplate.update(sql, 1, "Jude", "Bellingham");
        System.out.println("Number of rows affected: " + res);
    }
}
