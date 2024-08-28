package org.hotellerie.Repositories;

import org.hotellerie.Entities.Image;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class ImageRepoTest {
@Autowired
ImageRepo imageRepo;
@Autowired
RoomRepo roomRepo;
    @Test
    void saveIamge(){
//        Image imageR1 = Image
//                .builder()
//                .url("C:/Users/ebehe/Desktop/RoomsImages/pexels-atbo-66986-245208.jpg")
//                .room(roomRepo.findById(1L).get())
//                .build();
//        Image imageR2 = Image
//                .builder()
//                .url("C:/Users/ebehe/Desktop/RoomsImages/pexels-atbo-66986-245208.jpg")
//                .room(roomRepo.findById(1L).get())
//                .build();
//        Image imageR3 = Image
//                .builder()
//                .url("C:/Users/ebehe/Desktop/RoomsImages/pexels-atbo-66986-245208.jpg")
//                .room(roomRepo.findById(1L).get())
//                .build();
//
//        imageRepo.saveAll(List.of(imageR1,imageR2,imageR3));
    }

}