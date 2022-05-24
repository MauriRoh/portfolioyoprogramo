package com.portfolio.service;

import com.portfolio.domain.Ability;
import java.util.List;

public interface HabilidadService {
    
    public List<Ability> listarHabilidad();
    
    public void guardar (Ability habilidad);
    
    public void eliminar (Ability habilidad);
    
    public Ability encontrarHabilidad (Ability habilidad);
}
