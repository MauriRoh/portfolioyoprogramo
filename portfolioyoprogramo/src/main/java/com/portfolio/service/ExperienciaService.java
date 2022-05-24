package com.portfolio.service;

import com.portfolio.domain.Experiencia;
import java.util.List;

public interface ExperienciaService {
    
    public List<Experiencia> listarExperiencia();
    
    public void guardar (Experiencia experiencia);
    
    public void eliminar (Experiencia experiencia);
    
    public Experiencia encontrarExperiencia (Experiencia experiencia);
    
}
