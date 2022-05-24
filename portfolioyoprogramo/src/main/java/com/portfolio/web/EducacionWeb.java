package com.portfolio.web;

import com.portfolio.service.EducacionService;
import com.portfolio.domain.Educacion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class EducacionWeb {
    
    @Autowired
    private EducacionService educacionService;
    
    @GetMapping("/educacion")
    public String listarEducacion(Model model){
        var educacion = educacionService.listarEducacion();
        model.addAttribute("educacion", educacion);
        
        return "educacion";
    }
    
    @GetMapping("educacion/agregar")
    public String agregar(Educacion educacion){
        return "create_educacion";
    }
    
    // Formulario metodo Post para guardar || Validación de erorres
    @PostMapping("educacion/guardar")
    public String guardar(Educacion educacion){
        educacionService.guardar(educacion);
        return "redirect:/educacion";
    }
    
    // Boton editar datos
    @GetMapping("educacion/editar/{id_educacion}")
    public String editar(Educacion educacion, Model model){
        educacion = educacionService.encontrarEducacion(educacion);
        model.addAttribute("educacion", educacion);
        return "create_educacion";
    }
    
    // Boton eliminar registro
    @GetMapping("educacion/eliminar/{id_educacion}")
    public String eliminar(Educacion Educacion){
        educacionService.eliminar(Educacion);
        return "redirect:/educacion";
    }
    
    
}
