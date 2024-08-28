package org.hotellerie.Repositories;

import org.hotellerie.Entities.Room;
import org.hotellerie.enums.RoomsEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RoomRepo extends JpaRepository<Room,Long> {
    @Query("SELECT r FROM Room r WHERE r.numberOfChildren >= :numberOfChildren AND r.numberOfAdults >= :numberOfAdults AND r.roomType = :roomType AND r.roomId NOT IN " +
            "(SELECT res.room.roomId FROM Reservation res WHERE :arrivalDate < res.departureDate AND :departureDate > res.arrivalDate)")
    List<Room> findAvailableRoomsByType(@Param("arrivalDate") Date arrivalDate, @Param("departureDate") Date departureDate, @Param("numberOfChildren") int numberOfChildren, @Param("numberOfAdults") int numberOfAdults, @Param("roomType") RoomsEnum roomType);
    @Query("SELECT r FROM Room r WHERE r.numberOfChildren >= :numberOfChildren AND r.numberOfAdults >= :numberOfAdults AND r.roomId NOT IN " +
            "(SELECT res.room.roomId FROM Reservation res WHERE :arrivalDate < res.departureDate AND :departureDate > res.arrivalDate)")
    List<Room> findAvailableRooms(@Param("arrivalDate") Date arrivalDate, @Param("departureDate") Date departureDate, @Param("numberOfChildren") int numberOfChildren, @Param("numberOfAdults") int numberOfAdults);
    List<Room> findByRoomDetailsIsContainingIgnoreCase(String detail);
}
