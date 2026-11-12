package spring.sio.resmat.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
public class TypeMateriel extends BaseEntity{
    @Column(length = 70,nullable = false,unique = true)
    private String nom;

    @Column(length = 6500)
    private String description;

    private int dureeMax=30;

    private boolean auCatalogue=true;

    @ManyToOne(optional = false)
    private Categorie categorie;

    @OneToMany(mappedBy = "typeMateriel")
    private List<Materiel> materiels=new ArrayList<>();

    @OneToMany(mappedBy = "typeMateriel")
    private List<Reservation> reservations=new ArrayList<>();
}
