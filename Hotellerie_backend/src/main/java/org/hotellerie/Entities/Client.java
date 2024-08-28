package org.hotellerie.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "reservationList")
@Table(
        name = "client",
        uniqueConstraints = {
                @UniqueConstraint(
name = "emailUnique",
                        columnNames = "email"
                )
}
)
public class Client {
    @Id
    @SequenceGenerator(
            name = "numClientSequence",
            sequenceName = "numClientSequence",
            allocationSize = 1
    )
    @GeneratedValue(
                    generator = "numClientSequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long numClient ;
    private String firstName ;
    private String lastName ;
    @Column(name = "email",nullable = false)
    private String emailAdress;
    private String phoneNumber;
    private String password;
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservationList;

}