package org.hotellerie.Services;

import org.hotellerie.Entities.Image;
import org.hotellerie.Entities.Room;
import org.hotellerie.Repositories.ImageRepo;
import org.hotellerie.Repositories.RoomRepo;
import org.hotellerie.enums.RoomsEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Service
public class RoomServ  {
    @Autowired
    private RoomRepo roomRepo;
    @Autowired
    private ImageRepo imageRepo;
    public Room createRoom(Room room, List<MultipartFile> files) throws IOException {
        List<Image> images = new ArrayList<>();
        for (MultipartFile file : files) {
            Image image = Image.builder()
                    .fileName(file.getOriginalFilename())
                    .fileType(file.getContentType())
                    .data(file.getBytes())
                    .room(room)
                    .build();
            images.add(image);
        }
        room.setImages(images);
        room = roomRepo.save(room);
        imageRepo.saveAll(images);
        return room;
    }

    public List<Room> getAllRooms() {
        return roomRepo.findAll();
    }
    public List<Room> getAvailableRoomsByType( String arrivalDateChar,
                                            String departureDateChar,
                                           int numberOfChildren,
                                           int numberOfAdults,
                                           String roomType) {
        Date arrivalDate = Date.valueOf(arrivalDateChar);
        Date departureDate = Date.valueOf(departureDateChar);
        RoomsEnum roomTypeEnum = RoomsEnum.fromValue(roomType);
        return roomRepo.findAvailableRoomsByType(arrivalDate,departureDate,numberOfChildren,numberOfAdults,roomTypeEnum);
    }
    public List<Room> getAllAvailableRooms( String arrivalDateChar,
                                            String departureDateChar,
                                            int numberOfChildren,
                                            int numberOfAdults
                                            ) {
        Date arrivalDate = Date.valueOf(arrivalDateChar);
        Date departureDate = Date.valueOf(departureDateChar);
        return roomRepo.findAvailableRooms(arrivalDate,departureDate,numberOfChildren,numberOfAdults);
    }

    public List<Room> searchRooms(String roomDetails) {
        return roomRepo.findByRoomDetailsIsContainingIgnoreCase(roomDetails);
    }
}
