package spring.sio.resmat.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Emprunt extends BaseEntity{

    private LocalDateTime dateRemise=LocalDateTime.now();

    private LocalDateTime dateRetour=null;

    @Column(length = 6500)
    private String etatAvant;

    @Column(length = 6500)
    private String etatApres;

    @OneToOne(mappedBy = "emprunt",optional = false)
    private Reservation reservation;

    @ManyToOne
    private Materiel materiel;
}
