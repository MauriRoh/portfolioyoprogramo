package com.portfolio.service;

import com.portfolio.dao.IdiomaDaoInterface;
import com.portfolio.domain.Idioma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IdiomaServiceImple implements IdiomaService {
    
    @Autowired
    public IdiomaDaoInterface idiomaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Idioma> listarIdioma() {
        return (List<Idioma>) idiomaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Idioma idioma) {
        idiomaDao.save(idioma);
    }

    @Override
    @Transactional
    public void eliminar(Idioma idioma) {
        idiomaDao.delete(idioma);
    }

    @Override
    @Transactional(readOnly = true)
    public Idioma encontrarIdioma(Idioma idioma) {
        return idiomaDao.findById(idioma.getId_idioma()).orElse(null);
    }
    
}
