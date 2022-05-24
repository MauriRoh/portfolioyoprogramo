package com.portfolio.service;


import com.portfolio.dao.ExperienciaDaoInterface;
import com.portfolio.domain.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExperienciaServiceImple implements ExperienciaService {
    
    @Autowired
    private ExperienciaDaoInterface experienciaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Experiencia> listarExperiencia() {
        return (List<Experiencia>) experienciaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Experiencia experiencia) {
        experienciaDao.save(experiencia);
    }

    @Override
    @Transactional
    public void eliminar(Experiencia experiencia) {
        experienciaDao.delete(experiencia);
    }

    @Override
    @Transactional(readOnly = true)
    public Experiencia encontrarExperiencia(Experiencia experiencia) {
        return experienciaDao.findById(experiencia.getId_experiencia()).orElse(null);
    }
    
}
