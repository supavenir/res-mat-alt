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
public class Categorie extends BaseEntity{
    @Column(length = 150,nullable = false,unique = true)
    private String libelle;

    @OneToMany(mappedBy = "categorie")
    private List<TypeMateriel> typeMateriels=new ArrayList<>();
}
