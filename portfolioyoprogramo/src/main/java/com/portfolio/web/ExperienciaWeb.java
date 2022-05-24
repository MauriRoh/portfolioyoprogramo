package com.portfolio.web;

import com.portfolio.service.ExperienciaService;
import com.portfolio.domain.Experiencia;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ExperienciaWeb {
    
    @Autowired
    private ExperienciaService experienciaService;
    
    @GetMapping("/experiencia")
    public String listarExperiencia(Model model){
        var experiencia = experienciaService.listarExperiencia();
        model.addAttribute("experiencia", experiencia);
        
        return ("experiencia");
        
    }
    
    @GetMapping("experiencia/agregar")
    public String agregar(Experiencia experiencia){
        return "create_experiencia"; 
    }
    
    // Formulario metodo Post para guardar || Validación de erorres
    @PostMapping("experiencia/guardar")
    public String guardar(Experiencia experiencia){
        experienciaService.guardar(experiencia);
        return "redirect:/experiencia"; 
    }
    
    // Boton editar datos
    @GetMapping("experiencia/editar/{id_experiencia}")
    public String editar (Experiencia experiencia, Model model){
        experiencia = experienciaService.encontrarExperiencia(experiencia);
        model.addAttribute("experiencia", experiencia);
        return "create_experiencia"; 
    }
    
    // Boton eliminar registro
    @GetMapping("experiencia/eliminar/{id_experiencia}")
    public String eliminar(Experiencia experiencia){
        experienciaService.eliminar(experiencia);
        return "redirect:/experiencia"; 
    }

}
