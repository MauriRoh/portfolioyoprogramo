package com.portfolio.service;

import com.portfolio.domain.Idioma;
import java.util.List;

public interface IdiomaService {
    
    public List<Idioma> listarIdioma();
    
    public void guardar (Idioma idioma);
    
    public void eliminar (Idioma idioma);
    
    public Idioma encontrarIdioma (Idioma idioma);
    
}
