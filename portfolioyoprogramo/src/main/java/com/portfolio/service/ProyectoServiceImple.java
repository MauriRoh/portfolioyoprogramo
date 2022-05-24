package com.portfolio.service;

import com.portfolio.dao.ProyectoDaoInterface;
import com.portfolio.domain.Proyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProyectoServiceImple implements ProyectoService{
    
    
    @Autowired
    private ProyectoDaoInterface proyectoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Proyecto> listarProyecto() {
        return (List<Proyecto>) proyectoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Proyecto proyecto) {
        proyectoDao.save(proyecto);
    }

    @Override
    @Transactional
    public void eliminar(Proyecto proyecto) {
        proyectoDao.delete(proyecto);
    }

    @Override
    @Transactional(readOnly = true)
    public Proyecto encontrarProyecto(Proyecto proyecto) {
        return proyectoDao.findById(proyecto.getId_proyecto()).orElse(null);
    }
    
}
