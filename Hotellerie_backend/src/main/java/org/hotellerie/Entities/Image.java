package org.hotellerie.Entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Image {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY

    )
    private Long id;
    private String fileName;

    private String fileType;

    @Lob
    private byte[] data;
    @ManyToOne(
            fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "room_num"
    )
    private Room room;
}
