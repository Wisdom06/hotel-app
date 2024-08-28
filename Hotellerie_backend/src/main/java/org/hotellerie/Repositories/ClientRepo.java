package org.hotellerie.Repositories;

import org.hotellerie.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client,Long> {

    Client findByEmailAdress(String email);
}
