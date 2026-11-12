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
public class Reservation extends BaseEntity{

    @Column(nullable = true)
    private Boolean acceptee=null;

    @Column(length = 6500)
    private String motif;

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    @ManyToOne(optional = true)
    private Utilisateur gestionnaire;

    @ManyToOne(optional = false)
    private Utilisateur emprunteur;

    @ManyToOne(optional = false)
    private TypeMateriel typeMateriel;

    @OneToOne(optional = true)
    private Emprunt emprunt;
}
