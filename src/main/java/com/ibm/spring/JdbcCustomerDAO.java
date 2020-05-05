package com.ibm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import java.util.List;

public class JdbcCustomerDAO implements CustomerDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<CustomerTo> getAllCustomers() {

        String sql = "select * from customers";
        List list = jdbcTemplate.query(sql, new CustomerRowMapper());
        return list;
    }

    public CustomerTo getCustomerByCid(int cid) {

        String sql ="select * from customers where cid=?";
        CustomerTo cto = (CustomerTo)jdbcTemplate.queryForObject(sql, new CustomerRowMapper(), cid);
        return cto;
    }

    public CustomerTo getCustomerByEmail(String email) {
        String sql = "select * from customers where email=?";
        CustomerTo cto = (CustomerTo)jdbcTemplate.queryForObject(sql, new CustomerRowMapper(),email);
        return cto;
    }

    public CustomerTo getCustomerByCity(String city) {
        String sql = "select * from customers where city =?";
        List list = jdbcTemplate.query(sql,  new CustomerRowMapper(),city);
        return null;
    }

    public int getCustomersCount() {

        String sql = "select count(*) from customers";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    public String getCustomersCityByEmail(String email) {
        String sql ="select city from customers where email=?";
        String city = (String)jdbcTemplate.queryForObject(sql,String.class,email);
        return city;
    }

    public Long getCustomerPhoneByEmail(String email) {

        String sql = "select phone from customers where email=?";
        Long ph =(Long) jdbcTemplate.queryForObject(sql,Long.class,email);
        return ph;
    }
}
