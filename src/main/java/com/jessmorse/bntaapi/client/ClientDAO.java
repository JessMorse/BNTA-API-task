package com.jessmorse.bntaapi.client;

import java.util.List;
import java.util.Optional;

public interface ClientDAO {
    void addClient(Client client);
    List<Client> viewAllClients();
    Optional<Client> viewClientByName(String clientName);
    Optional<Client> viewClientByConsultant(long consultantId);
}
