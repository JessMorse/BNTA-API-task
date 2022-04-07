package com.jessmorse.bntaapi.consultant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Qualifier("consultant")
@Repository
public class ConsultantDataAccessService implements ConsultantDAO {

    @Autowired
    ConsultantRowMapper consultantRowMapper;

    private JdbcTemplate jdbcTemplate;

    public ConsultantDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addConsultant(Consultant consultant) {
        String sql = """
                INSERT INTO consultants(id, name, location, able_to_relocate, current_client)
                VALUES(DEFAULT, ?, ?, ?, ? )""";
        jdbcTemplate.update(sql, consultant.getName(), consultant.getLocation(), consultant.getAbleToRelocate(),
        consultant.getCurrentClient());
    }

    @Override
    public List<Consultant> viewAllConsultants() {
        String sql = """
                SELECT * FROM consultants;""";
        return jdbcTemplate.query(sql, consultantRowMapper);
    }

    @Override
    public Optional<Consultant> getConsultantById(int consultantId) {
        String sql = """
                SELECT * FROM consultants WHERE id = ?;""";
        return jdbcTemplate.query(sql, consultantRowMapper, consultantId)
                .stream().findAny();
    }

    @Override
    public void updateConsultantLocation(int consultantId, String location) {
        String sql = """
                UPDATE consultants SET location = ? WHERE consultant_id = ?;""";
        jdbcTemplate.update(sql, location, consultantId);
    }

    @Override
    public void updateConsultantDetails(int consultantId, Consultant consultant) {
        String sql = """
                UPDATE consultants SET consultant_name = ?, location = ?, able_to_relocate = ?,
                 current_client = ? WHERE consultant_id = ?;""";
        jdbcTemplate.update(sql, consultant.getName(), consultant.getLocation(), consultant.getAbleToRelocate(),
                consultant.getCurrentClient(), consultantId);
    }
}
