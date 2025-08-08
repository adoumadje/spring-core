package com.adoumadje.springjdbc.dao;

import com.adoumadje.springjdbc.dto.Employee;
import com.adoumadje.springjdbc.dto.EmployeeRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;
    private EmployeeRowMapper employeeRowMapper;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public EmployeeRowMapper getEmployeeRowMapper() {
        return employeeRowMapper;
    }

    public void setEmployeeRowMapper(EmployeeRowMapper employeeRowMapper) {
        this.employeeRowMapper = employeeRowMapper;
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

    @Override
    public Employee read(int id) {
        String sql = """
                SELECT * FROM employee
                WHERE id = ?
                """;
        return jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
    }

    @Override
    public List<Employee> readAll() {
        String sql = """
                SELECT * FROM employee
                """;
        return jdbcTemplate.query(sql, employeeRowMapper);
    }
}
