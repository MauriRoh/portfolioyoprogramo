package com.portfolio.web;

import com.portfolio.service.HabilidadService;
import com.portfolio.domain.Ability;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class HabilidadWeb {
    
    @Autowired
    private HabilidadService habilidadService;
    
    @GetMapping("/habilidad")
    public String listaHabilidad(Model model){
        var habilidades = habilidadService.listarHabilidad();
        model.addAttribute("habilidades", habilidades);
        
        return "habilidad";
    }
    
    @GetMapping("habilidad/agregar")
    public String agregar(Ability habilidad){
        return "create_habilidad";
    }
    
    // Formulario metodo Post para guardar || Validación de erorres
    @PostMapping("habilidad/guardar")
    public String guardar(Ability habilidad){
        habilidadService.guardar(habilidad);
        return "redirect:/habilidad";
    }
    
    // Boton editar datos
    @GetMapping("habilidad/editar/{id_habilidad}")
    public String editar(Ability habilidad, Model model){
        habilidad = habilidadService.encontrarHabilidad(habilidad);
        model.addAttribute("ability", habilidad);
        return "create_habilidad";
    }
    
    // Boton eliminar registro
    @GetMapping("habilidad/eliminar/{id_habilidad}")
    public String eliminar(Ability habilidad){
        habilidadService.eliminar(habilidad);
        return "redirect:/habilidad";
    }
}



    
    
    
    

    