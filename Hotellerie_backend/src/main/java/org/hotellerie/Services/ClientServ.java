package org.hotellerie.Services;

import org.hotellerie.Entities.Client;
import org.hotellerie.Repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServ {
    @Autowired
    ClientRepo clientRepo;

    public void createClient(Client client) {
        clientRepo.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    public Client getClientByEmail(String email) {
        return clientRepo.findByEmailAdress(email);
    }
}
