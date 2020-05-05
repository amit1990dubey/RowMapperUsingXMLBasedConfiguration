package com.ibm.spring;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<CustomerTo> {


    public CustomerTo mapRow(ResultSet rs, int rn) throws SQLException {
        CustomerTo cto = new CustomerTo();
        cto.setCid(rs.getInt(1));
        cto.setCname(rs.getString(2));
        cto.setEmail(rs.getString(3));
        cto.setPhone(rs.getLong(4));
        cto.setCity(rs.getString(5));
        return cto;
    }
}
