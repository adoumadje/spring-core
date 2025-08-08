package com.adoumadje.springjdbc.dao;

import com.adoumadje.springjdbc.dto.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(Employee employee) {
        String sql = """
                INSERT INTO employee
                VALUES (?, ?, ?)
                """;
        return jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
    }

    @Override
    public int update(Employee employee) {
        String sql = """
                UPDATE employee
                SET firstname = ?, lastname = ?
                WHERE id = ?
                """;
        return jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
    }

    @Override
    public int delete(Employee employee) {
        String sql = """
                DELETE FROM employee
                WHERE id = ?
                """;
        return jdbcTemplate.update(sql, employee.getId());
    }
}
