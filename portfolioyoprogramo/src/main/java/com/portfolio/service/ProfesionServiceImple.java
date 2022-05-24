package com.portfolio.service;

import com.portfolio.dao.ProfesionDaoInterface;
import com.portfolio.domain.Profesion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProfesionServiceImple implements ProfesionService {
    
    @Autowired
    private ProfesionDaoInterface profesionDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Profesion> listarProfesion() {
        return (List<Profesion>) profesionDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Profesion profesion) {
        profesionDao.save(profesion);
    }

    @Override
    @Transactional
    public void eliminar(Profesion profesion) {
        profesionDao.delete(profesion);
    }

    @Override
    public Profesion encontrarProfesion(Profesion profesion) {
        return profesionDao.findById(profesion.getId_profesion()).orElse(null);
    }
    
}
