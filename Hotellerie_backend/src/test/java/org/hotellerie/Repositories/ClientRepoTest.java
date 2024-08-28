package org.hotellerie.Repositories;

import org.hotellerie.Entities.Client;
import org.hotellerie.Entities.Reservation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClientRepoTest {
    @Autowired
    private ClientRepo clientRepo;

    @Test
    void saveClient(){

//        Reservation reservation1 = Reservation.builder()
//                .arrivalDate(Date.valueOf(LocalDate.of(2024,06,06)))
//                .DepartureDate(Date.valueOf(LocalDate.of(2024,05,06)))
//
//                .build();
//        Reservation reservation2 = Reservation.builder()
//                .arrivalDate(Date.valueOf(LocalDate.of(2024,06,06)))
//                .DepartureDate(Date.valueOf(LocalDate.of(2024,05,06)))
//
//                .build();
//        List<Reservation> reservationList = List.of(reservation1,reservation2);
        Client c1 = Client.builder()
                    .firstName("FOLI")
                .lastName("Wisdom")
                .emailAdress("wisdomfoli@gmail.com")
                .phoneNumber("9000000")
                .build();
        Client c2 = Client.builder()
                .firstName("COOMEE")
                .lastName("Emmanuella")
                .emailAdress("emmanuellacoomee.com")
                .phoneNumber("9000001")
                .build();
        Client c3 = Client.builder()
                .firstName("FOLI")
                .lastName("Lala")
                .emailAdress("lalafoli@gmail.com")
                .phoneNumber("9000002")
                .build();

        clientRepo.saveAll(List.of(c1,c2,c3));

    }
    @Test
    void printClients(){
        List<Client> clientList =
                clientRepo.findAll();
        System.out.println("clientList :"+clientList);
    }
}