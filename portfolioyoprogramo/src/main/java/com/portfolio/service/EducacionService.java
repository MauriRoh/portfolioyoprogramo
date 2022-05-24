package com.portfolio.service;

import com.portfolio.domain.Educacion;
import java.util.List;

public interface EducacionService {
    
    public List<Educacion> listarEducacion();
    
    public void guardar (Educacion educacion);
    
    public void eliminar (Educacion educacion);
    
    public Educacion encontrarEducacion (Educacion educacion);
    
}
