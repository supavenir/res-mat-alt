package spring.sio.resmat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.sio.resmat.entities.Categorie;

import java.util.UUID;

public interface CategorieRepository extends JpaRepository<Categorie, UUID> {
}

