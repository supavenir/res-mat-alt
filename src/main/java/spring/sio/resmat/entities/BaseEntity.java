package spring.sio.resmat.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter @Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    private UUID id=UUID.randomUUID();
    private LocalDateTime createdAt=LocalDateTime.now();
}
