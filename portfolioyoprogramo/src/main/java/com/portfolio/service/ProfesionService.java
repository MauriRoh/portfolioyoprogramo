package com.portfolio.service;

import com.portfolio.domain.Profesion;
import java.util.List;

public interface ProfesionService {
    
    public List<Profesion> listarProfesion();
    
    public void guardar (Profesion profesion);
    
    public void eliminar (Profesion profesion);
    
    public Profesion encontrarProfesion (Profesion profesion);
    
}
