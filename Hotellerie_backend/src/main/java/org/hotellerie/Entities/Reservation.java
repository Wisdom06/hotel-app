package org.hotellerie.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "reservation"
)
public class Reservation {
    @Id

            @GeneratedValue(
                    strategy = GenerationType.IDENTITY

            )
    private Long numReservation;
    @Temporal(TemporalType.DATE)
    private Date arrivalDate;
    @Temporal(TemporalType.DATE)
    private Date departureDate;
    @ManyToOne(

    )
    @JoinColumn(name = "client_id")

    private Client client;
    @ManyToOne(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "room_id"
    )
    private Room room;
}
