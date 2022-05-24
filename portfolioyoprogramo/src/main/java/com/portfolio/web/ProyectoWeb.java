package com.portfolio.web;

import com.portfolio.service.ProyectoService;
import com.portfolio.domain.Proyecto;
import java.nio.file.Path;
import java.nio.file.Paths;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ProyectoWeb {
    
    @Autowired
    private ProyectoService proyectoService;
    
    @GetMapping("/proyecto")
    public String listarProyecto(Model model){
        var proyectos = proyectoService.listarProyecto();
        model.addAttribute("proyectos", proyectos);
        
        return "proyecto";
    }
    
    @GetMapping("proyecto/agregar")
    public String agregar(Proyecto proyecto){
        return "create_proyecto";
    }
    
    // Formulario metodo Post para guardar || Validación de erorres
    @PostMapping("proyecto/guardar")
    public String guardar(Proyecto proyecto){
        proyectoService.guardar(proyecto);
        return "redirect:/proyecto";
    }
    
    // Boton editar datos
    @GetMapping("proyecto/editar/{id_proyecto}")
    public String editar(Proyecto proyecto, Model model){
        proyecto = proyectoService.encontrarProyecto(proyecto);
        model.addAttribute("proyecto", proyecto);
        return "create_proyecto";
    }
    
    // Boton eliminar registro
    @GetMapping("proyecto/eliminar/{id_proyecto}")
    public String eliminar(Proyecto proyecto){
        proyectoService.eliminar(proyecto);
        return "redirect:/proyecto";
    }
    
}
 