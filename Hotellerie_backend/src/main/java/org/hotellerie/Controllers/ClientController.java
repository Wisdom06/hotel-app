package org.hotellerie.Controllers;

import org.hotellerie.Entities.Client;
import org.hotellerie.Services.ClientServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientServ clientServ ;

    @PostMapping("/createClient")
    public ResponseEntity<String> createClient(@RequestBody Client client){
        clientServ.createClient(client);
        return ResponseEntity.ok("Client enregistre");
    }
    @GetMapping("/getAllClients")
    public List<Client> getAllClients(){
        List<Client> clients = clientServ.getAllClients();
        return clients;
    }
    @GetMapping("/getClientByEmail/{email}")
    public Client getClientByEmail(@PathVariable("email") String email){
        Client client = clientServ.getClientByEmail(email);
        return client;
    }
}
