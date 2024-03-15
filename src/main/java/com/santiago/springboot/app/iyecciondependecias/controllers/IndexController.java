package com.santiago.springboot.app.iyecciondependecias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.santiago.springboot.app.iyecciondependecias.models.services.IService;


@Controller
public class IndexController {

    @Autowired // busca lago que este guardado de tipo MiServicio
    @Qualifier("miServicioComplejo")
    private IService servicio;

    
    @GetMapping({ "/index", "", "/" })
    public String index(Model model) {
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }


    
}
