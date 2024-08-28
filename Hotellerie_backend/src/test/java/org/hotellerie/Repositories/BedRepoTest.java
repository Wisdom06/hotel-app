package org.hotellerie.Repositories;

import org.hotellerie.Entities.Bed;
import org.hotellerie.Entities.Room;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BedRepoTest {
    @Autowired
    BedRepo bedRepo;
    @Autowired
    RoomRepo roomRepo;

@Test
public void createBed(){
    Bed bed1 = Bed.builder()
            .bedType("King Size")
            .capacity(3)
            .room(roomRepo.findById(1L).get())
            .build();
    Bed bed2 = Bed.builder()
            .bedType("Queen Size")
            .capacity(2)
            .room(roomRepo.findById(2L).get())
            .build();
    Bed bed3 = Bed.builder()
            .bedType("Simple Size")
            .capacity(1)
            .room(roomRepo.findById(3L).get())
            .build();

    bedRepo.save(bed1);
}
}