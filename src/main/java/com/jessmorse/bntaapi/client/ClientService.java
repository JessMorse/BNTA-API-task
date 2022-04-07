package com.jessmorse.bntaapi.client;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientDAO clientDAO;

    public ClientService(@Qualifier("client") ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    public void addClient(Client client){
        clientDAO.addClient(client);
    };

    public List<Client> viewAllClients(){
        return clientDAO.viewAllClients();
    };

    public Optional<Client> viewClientByName(String clientName){
        return clientDAO.viewClientByName(clientName);
    };

    public Optional<Client> viewClientByConsultant(long consultantId){
        return clientDAO.viewClientByConsultant(consultantId);
    };
}
