package com.portfolio.web;

import com.portfolio.service.ProfesionService;
import com.portfolio.domain.Profesion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ProfesionWeb {
    
    @Autowired
    private ProfesionService profesionService;
    
    @GetMapping("/profesion")
    public String listaProfesion(Model model){
        var profesiones = profesionService.listarProfesion();
        model.addAttribute("profesiones", profesiones);
        
        return "profesion";
    }
    
    @GetMapping("profesion/agregar")
    public String agregar(Profesion profesion){
        return "create_profesion";
    }
    
    // Formulario metodo Post para guardar || Validación de erorres
    @PostMapping("profesion/guardar")
    public String guardar(Profesion profesion){
        profesionService.guardar(profesion);
        return "redirect:/profesion";
    }
    
    // Boton editar datos
    @GetMapping("profesion/editar/{id_profesion}")
    public String editar(Profesion profesion, Model model){
        profesion = profesionService.encontrarProfesion(profesion);
        model.addAttribute("profesion", profesion);
        return "create_profesion";
    }
    
    // Boton eliminar registro
    @GetMapping("profesion/eliminar/{id_profesion}")
    public String eliminar(Profesion profesion){
        profesionService.eliminar(profesion);
        return "redirect:/profesion";
    }
    
    
}
