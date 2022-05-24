package com.portfolio.service;

import com.portfolio.dao.EducacionDaoInterface;
import com.portfolio.domain.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducacionServiceImple implements EducacionService{
    
    @Autowired
    public EducacionDaoInterface educacionDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Educacion> listarEducacion() {
        return (List<Educacion>) educacionDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Educacion educacion) {
        educacionDao.save(educacion);
    }

    @Override
    @Transactional
    public void eliminar(Educacion educacion) {
        educacionDao.delete(educacion);
    }

    @Override
    @Transactional(readOnly = true)
    public Educacion encontrarEducacion(Educacion educacion) {
        return educacionDao.findById(educacion.getId_educacion()).orElse(null);
    }
    
}
