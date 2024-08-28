package org.hotellerie.Controllers;

import org.hotellerie.Entities.Room;
import org.hotellerie.Services.RoomServ;
import org.hotellerie.enums.RoomsEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/rooms")
public class RoomController {
    @Autowired
    private RoomServ roomServ;
    @PostMapping("/createRoom")
    public Room createRoom(@RequestPart("room") Room room, @RequestPart("files") List<MultipartFile> files) throws IOException {
        return roomServ.createRoom(room, files);
    }
    @GetMapping("/getAllRooms")
    public List<Room> getAllRooms(){
        return roomServ.getAllRooms();
    }
    @GetMapping("/searchByType")
    public List<Room> getAllAvailableRoomsByType(@RequestParam String arrivalDate,
                                           @RequestParam String departureDate,
                                           @RequestParam int numberOfChildren,
                                           @RequestParam int numberOfAdults,
                                           @RequestParam String roomType) {
        return roomServ.getAvailableRoomsByType(arrivalDate, departureDate, numberOfChildren, numberOfAdults,roomType);
    }
    @GetMapping("/search")
    public List<Room> getAllAvailableRooms(@RequestParam String arrivalDate,
                                                 @RequestParam String departureDate,
                                                 @RequestParam int numberOfChildren,
                                                 @RequestParam int numberOfAdults) {
        return roomServ.getAllAvailableRooms(arrivalDate, departureDate, numberOfChildren, numberOfAdults);
    }
    @GetMapping("/searchRoom/{roomDetails}")
    public List<Room> searchRoom(@PathVariable("roomDetails") String roomDetails){
        return roomServ.searchRooms(roomDetails);
    }
}
