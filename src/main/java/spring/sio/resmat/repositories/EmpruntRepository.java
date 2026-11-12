package spring.sio.resmat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.sio.resmat.entities.Emprunt;

import java.util.UUID;

public interface EmpruntRepository extends JpaRepository<Emprunt, UUID> {
}

