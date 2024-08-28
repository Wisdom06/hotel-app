package org.hotellerie.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hotellerie.enums.RoomsEnum;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private Long roomId;
    private double price;
    private int numberOfChildren ;
    private boolean hasSalon;
    private int numberOfAdults;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private  String roomDetails;
    @Enumerated(EnumType.STRING)
    private RoomsEnum roomType;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "room"
    )
    private List<Image> images;
    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "room"
    )
    @JsonManagedReference
    private Bed bed;
    @OneToMany(cascade = CascadeType.ALL,
    mappedBy = "room")
    private List<Reservation> reservations;


}
