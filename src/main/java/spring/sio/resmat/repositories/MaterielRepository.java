package spring.sio.resmat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.sio.resmat.entities.Materiel;

import java.util.UUID;

public interface MaterielRepository extends JpaRepository<Materiel, UUID> {
}

