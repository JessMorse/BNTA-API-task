package com.jessmorse.bntaapi.consultant;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ConsultantRowMapper implements RowMapper<Consultant> {
    @Override
    public Consultant mapRow(ResultSet rs, int rowNum) throws SQLException {
        Consultant consultant = new Consultant(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("location"),
                rs.getBoolean("able_to_relocate"),
                rs.getInt("current_client")
        );
        return consultant;
    }
}
