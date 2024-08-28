package org.hotellerie;

import org.hotellerie.Entities.Reservation;
import org.hotellerie.Repositories.ClientRepo;
import org.hotellerie.Repositories.ReservationRepo;
import org.hotellerie.Repositories.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class HotellerieApplication {
    @Autowired
    ReservationRepo reservationRepo;
    @Autowired
    ClientRepo clientRepo;
    @Autowired
    RoomRepo roomRepo;

    public static void main(String[] args) {
        SpringApplication.run(HotellerieApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
//            Reservation reservation2 = Reservation.builder()
//                    .arrivalDate(java.sql.Date.valueOf(LocalDate.of(2024,06,06)))
//                    .DepartureDate(java.sql.Date.valueOf(LocalDate.of(2024,05,06)))
//                    .client(clientRepo.findById(2L).get())
//                    .room(roomRepo.findById(102L).get())
//                    .build();
//            reservationRepo.save(reservation2);
        };
    }

}
