package org.hotellerie.Repositories;

import org.hotellerie.Entities.Reservation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class ReservationRepoTest {
    @Autowired
    ReservationRepo reservationRepo;
    @Autowired
    ClientRepo clientRepo;
    @Autowired
    RoomRepo roomRepo;
    @Test
    public void reserTest(){
//        Client client = Client.builder()
//                .emailAdress("ama@gmail.com")
//                .firstName("ama")
//                .lastName("amavi")
//                .phoneNumber("0000")
//                .build();
//        Room room = Room.builder()
//                .isReserved(false)
//                .roomType(RoomsEnum.LUXURY)
//                .roomDetails("This room is a LUXURY")
//                .build();
//        Reservation reservation1 = Reservation.builder()
//                .arrivalDate(Date.valueOf(LocalDate.of(2024,06,06)))
//                .DepartureDate(Date.valueOf(LocalDate.of(2024,05,06)))
//                .client(client)
//                .room(room)
//                .build();
//
//        reservationRepo.save(reservation1);

        Reservation reservation2 = Reservation.builder()
                .arrivalDate(Date.valueOf(LocalDate.of(2024,06,06)))
                .departureDate(Date.valueOf(LocalDate.of(2024,05,06)))
                .client(clientRepo.findById(2L).get())
                .build();
        reservationRepo.save(reservation2);
    }
    @Test
    public void findByClientFirstName(){
        List<Reservation> reservationList = reservationRepo.findByClientFirstName("foli");

        System.out.println(reservationList);
    }
    @Test
    public void findByClientEmailAdress(){
        List<Reservation> reservationList = reservationRepo.findByClientEmailAdress("wisdomfoli@gmail.com");

        System.out.println(reservationList);
    }

}