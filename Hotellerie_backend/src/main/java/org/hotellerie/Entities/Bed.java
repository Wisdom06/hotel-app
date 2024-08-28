package org.hotellerie.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bed {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String bedType;
    private int capacity;
    @OneToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "room_id"
    )
    @JsonBackReference
    private Room room;
}
