package spring.sio.resmat.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Utilisateur extends BaseEntity {
    @Column(length = 35)
    private String prenom;

    @Column(length = 35)
    private String nom;

    @Column(length = 20, unique = true)
    private String login;

    @Column(length = 255)
    private String motDePasse;

    @Column(length = 255,unique = true)
    private String email;

    @Column(nullable = false)
    private boolean gestionnaire=false;

    @OneToMany(mappedBy = "emprunteur")
    private List<Reservation> mesReservations=new ArrayList<>();

    @OneToMany(mappedBy = "gestionnaire")
    private List<Reservation> reservations=new ArrayList<>();
}
