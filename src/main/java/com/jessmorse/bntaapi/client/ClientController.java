package com.jessmorse.bntaapi.client;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public void addClient(@RequestBody Client client){
        clientService.addClient(client);
    };

    @GetMapping
    public List<Client> viewAllClients(){
        return clientService.viewAllClients();
    };

    @GetMapping("{name}")
    public Optional<Client> viewClientByName(@PathVariable("name") String clientName){
        return clientService.viewClientByName(clientName);
    };

    @GetMapping("/consultant/{consultantId}")
    public Optional<Client> viewClientByConsultant(@PathVariable long consultantId){
        return clientService.viewClientByConsultant(consultantId);
    };

}
