package com.portfolio.service;

import com.portfolio.domain.Proyecto;
import java.util.List;

public interface ProyectoService {
    
    public List<Proyecto> listarProyecto();
    
    public void guardar (Proyecto proyecto);
    
    public void eliminar (Proyecto proyecto);
    
    public Proyecto encontrarProyecto (Proyecto proyecto);
    
}
