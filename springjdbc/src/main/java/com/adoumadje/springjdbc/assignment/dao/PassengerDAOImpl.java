package com.adoumadje.springjdbc.assignment.dao;

import com.adoumadje.springjdbc.assignment.dto.Passenger;
import com.adoumadje.springjdbc.assignment.dto.PassengerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("passengerDAO")
public class PassengerDAOImpl implements PassengerDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private PassengerRowMapper passengerRowMapper;

    @Override
    public int create(Passenger passenger) {
        String sql = """
                INSERT INTO passenger
                VALUES (?, ?, ?)
                """;
        return jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstname(), passenger.getLastname());
    }

    @Override
    public int update(Passenger passenger) {
        String sql = """
                UPDATE passenger
                SET firstname = ?, lastname = ?
                WHERE id = ?
                """;
        return jdbcTemplate.update(sql, passenger.getFirstname(), passenger.getLastname(), passenger.getId());
    }

    @Override
    public int delete(Passenger passenger) {
        String sql = """
                DELETE FROM passenger
                WHERE id = ?
                """;
        return jdbcTemplate.update(sql, passenger.getId());
    }

    @Override
    public Passenger read(int id) {
        String sql = """
                SELECT * FROM passenger
                WHERE id = ?
                """;
        return jdbcTemplate.queryForObject(sql, passengerRowMapper, id);
    }

    @Override
    public List<Passenger> readAll() {
        String sql = """
                SELECT * FROM passenger
                """;
        return jdbcTemplate.query(sql, passengerRowMapper);
    }
}
