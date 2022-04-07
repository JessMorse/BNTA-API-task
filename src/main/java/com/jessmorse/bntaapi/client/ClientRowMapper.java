package com.jessmorse.bntaapi.client;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ClientRowMapper implements RowMapper<Client> {

    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        Client client = new Client(
                rs.getInt("client_id"),
                rs.getString("name"),
                rs.getString("sector"),
                rs.getString("location"),
                rs.getInt("number_of_consultants")
        );
        return client;
    }
}
