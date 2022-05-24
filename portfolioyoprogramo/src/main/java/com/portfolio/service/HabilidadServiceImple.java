package com.portfolio.service;

import com.portfolio.dao.HabilidadDaoInterface;
import com.portfolio.domain.Ability;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HabilidadServiceImple implements HabilidadService {
    
    
    @Autowired
    public HabilidadDaoInterface habilidadDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Ability> listarHabilidad() {
        return (List<Ability>) habilidadDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Ability habilidad) {
        habilidadDao.save(habilidad);
    }

    @Override
    @Transactional
    public void eliminar(Ability habilidad) {
        habilidadDao.delete(habilidad);
    }

    @Override
    @Transactional(readOnly = true)
    public Ability encontrarHabilidad(Ability habilidad) {
        return habilidadDao.findById(habilidad.getId_habilidad()).orElse(null);
    }
    
}
