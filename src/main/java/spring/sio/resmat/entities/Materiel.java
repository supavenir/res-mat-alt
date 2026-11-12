package spring.sio.resmat.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Materiel extends BaseEntity{

    @Column(length = 70,nullable = false,unique = true)
    private String nom;

    @Column(length = 6500)
    private String description;

    @Column(nullable = false)
    private boolean disponible=false;

    @ManyToOne(optional = false)
    private TypeMateriel typeMateriel;

    @OneToMany(mappedBy = "materiel")
    private List<Emprunt> emprunts=new ArrayList<>();

    private boolean deleted=false;
}
