package org.hotellerie.Controllers;

import org.hotellerie.Entities.Reservation;
import org.hotellerie.Services.ReservationServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservatinController {
    @Autowired
    private ReservationServ reservationServ;
    @PostMapping("/createReservation")
    public ResponseEntity<String> createReservation(@RequestBody Reservation reservation){
        reservationServ.createReservation(reservation);
        return ResponseEntity.ok("reservation Terminer");
    }

}
