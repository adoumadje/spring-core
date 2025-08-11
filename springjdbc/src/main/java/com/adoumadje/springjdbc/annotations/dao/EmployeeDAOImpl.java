package com.adoumadje.springjdbc.annotations.dao;

import com.adoumadje.springjdbc.annotations.dto.Employee;
import com.adoumadje.springjdbc.annotations.dto.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private EmployeeRowMapper employeeRowMapper;

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
