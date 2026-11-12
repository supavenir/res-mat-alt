package spring.sio.resmat.services;

import org.springframework.stereotype.Service;
import spring.sio.resmat.entities.TypeMateriel;
import spring.sio.resmat.repositories.TypeMaterielRepository;

import java.util.List;

@Service
public class TypeMaterielService {

    private final TypeMaterielRepository typeMaterielRepository;

    public TypeMaterielService(TypeMaterielRepository typeMaterielRepository) {
        this.typeMaterielRepository = typeMaterielRepository;
    }

    public List<TypeMateriel> findAll() {
        return typeMaterielRepository.findAll();
    }
}
