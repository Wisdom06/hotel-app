package org.hotellerie.Services;

import org.hotellerie.Entities.Reservation;
import org.hotellerie.Repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServ {
    @Autowired
    ReservationRepo reservationRepo;


    public void createReservation(Reservation reservation) {
        reservationRepo.save(reservation);
    }
}
