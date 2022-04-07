package com.jessmorse.bntaapi.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Qualifier("client")
@Repository
public class ClientDataAccessService implements ClientDAO{

    @Autowired
    ClientRowMapper clientRowMapper;

    private JdbcTemplate jdbcTemplate;

    public ClientDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addClient(Client client) {
        String sql = """
                   INSERT INTO CLIENTS(CLIENT_ID, NAME, SECTOR, LOCATION, NUMBER_OF_CONSULTANTS)
                    VALUES (DEFAULT, ?, ?,?,?);""";
        jdbcTemplate.update(sql, client.getName(), client.getSector(), client.getLocation(),
                client.getConsultantsRequired());
    }

    @Override
    public List<Client> viewAllClients() {
        String sql = """
                SELECT * FROM clients;""";
        return jdbcTemplate.query(sql,clientRowMapper);
    }

    @Override
    public Optional<Client> viewClientByName(String clientName) {
        String sql = """
                SELECT * FROM clients WHERE name = ?;""";
        return jdbcTemplate.query(sql, clientRowMapper, clientName).stream().findAny();
    }

    @Override
    public Optional<Client> viewClientByConsultant(long consultantId) {
        String sql = """
                SELECT * FROM clients JOIN consultants ON clients.client_id = consultants.current_client
                 WHERE consultants.id = ?;""";
        return jdbcTemplate.query(sql,clientRowMapper, consultantId).stream().findAny();
    }
}
