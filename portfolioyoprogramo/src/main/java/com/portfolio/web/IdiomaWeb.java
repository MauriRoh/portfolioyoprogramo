package com.portfolio.web;

import com.portfolio.service.IdiomaService;
import com.portfolio.domain.Idioma;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IdiomaWeb {
    
    @Autowired
    private IdiomaService idiomaService;
    
    @GetMapping("/idioma")
    public String listarIdioma(Model model){
        var idiomas = idiomaService.listarIdioma();
        model.addAttribute("idiomas", idiomas);
        
        return "idioma";
    }
    
    @GetMapping("idioma/agregar")
    public String agregar(Idioma idioma){
        return "create_idioma";
    }
    
    // Formulario metodo Post para guardar || Validación de erorres
    @PostMapping("idioma/guardar")
    public String guardar(Idioma idioma){
        idiomaService.guardar(idioma);
        return "redirect:/idioma";        
    }
    
    // Boton editar datos
    @GetMapping("idioma/editar/{id_idioma}")
    public String editar(Idioma idioma, Model model){
        idioma = idiomaService.encontrarIdioma(idioma);
        model.addAttribute("idioma", idioma);
        return "create_idioma";
    }
    
    // Boton eliminar registro
    @GetMapping("idioma/eliminar/{id_idioma}")
    public String eliminar(Idioma idioma){
        idiomaService.eliminar(idioma);
        return "redirect:/idioma";
    }
}
    