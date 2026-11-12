package spring.sio.resmat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.sio.resmat.services.TypeMaterielService;

@Controller
@RequestMapping("/types-materiel")
public class TypeMaterielController {

    private final TypeMaterielService typeMaterielService;

    public TypeMaterielController(TypeMaterielService typeMaterielService) {
        this.typeMaterielService = typeMaterielService;
    }

    @GetMapping
    public String index(ModelMap model) {
        model.put("types", typeMaterielService.findAll());
        return "/types-materiel/index";
    }
}
