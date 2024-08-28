package org.hotellerie.Repositories;

import org.hotellerie.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {

    List<Reservation> findByClientFirstName(String name);
    List<Reservation> findByClientEmailAdress(String name);
}
