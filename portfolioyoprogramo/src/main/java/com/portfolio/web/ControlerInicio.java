package com.portfolio.web;

import com.portfolio.domain.Persona;
import com.portfolio.service.PersonaService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

//@RestController
@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
//@RequestMapping("api/v1")
@Controller
@Slf4j
public class ControlerInicio {
    
    @Autowired
    private PersonaService personaService;
            
    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaService.listarPersona();
        model.addAttribute("personas", personas);
        
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "create_persona";
    }
    
    // Formulario metodo Post para guardar || Validación de erorres
    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    // Boton editar datos
    @GetMapping("/editar/{id_persona}")
    public String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "create_persona";
    }
    
    // Boton eliminar registro
    @GetMapping("/eliminar/{id_persona}")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }
    
}
