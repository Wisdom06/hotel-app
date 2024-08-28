package org.hotellerie.Repositories;

import org.hotellerie.Entities.Room;
import org.hotellerie.enums.RoomsEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RoomRepoTest {
    @Autowired
    RoomRepo roomRepo;
    @Autowired
    ClientRepo clientRepo;
    @Autowired
    BedRepo bedRepo;
    @Autowired
    ImageRepo imageRepo;
    @Test
    void saveRoom(){
//        Reservation reservation1 = Reservation.builder()
//                .arrivalDate(Date.valueOf(LocalDate.of(2024,06,06)))
//                .DepartureDate(Date.valueOf(LocalDate.of(2024,05,06)))
//                .client(clientRepo.findById(1L).get())
//                .build();

//        reservationRepo.save(reservation1);

//        Reservation reservation2 = Reservation.builder()
//                .arrivalDate(Date.valueOf(LocalDate.of(2024,06,06)))
//                .DepartureDate(Date.valueOf(LocalDate.of(2024,05,06)))
//                .client(clientRepo.findById(2L).get())
//                .build();

//        imageRepo.saveAll(List.of(imageR1,imageR1,imageR1));

        Room r1 = Room.builder()
                .roomType(RoomsEnum.BASIC)
                .numberOfChildren(6)
                .numberOfAdults(3)
                .price(200)
                .roomDetails("This is an BASIC room")
//                .images(List.of(imageR3,imageR3,imageR3))
//                .bed(bed1)
                .build();
//        Room r2 = Room.builder()
//                .roomType(RoomsEnum.LUXURY)
//                .numberOfChildren(4)
//                .numberOfAdults(2)
//                .price(200)
////                .bed(bed2)
////                .images(List.of(imageR1,imageR1,imageR1))
//                .roomDetails("This is an basic LUXURY ROOM")
//                .build();
//        Room r3 = Room.builder()
//                .roomType(RoomsEnum.SUITE)
//                .numberOfChildren(3)
//                .numberOfAdults(3)
//                .price(250)
////                .bed(bed3)
////                .images(List.of(imageR2,imageR2,imageR2))
//                .roomDetails("This is an SUITE room")
//                .build();

        roomRepo.saveAll(List.of(r1));
    }
}