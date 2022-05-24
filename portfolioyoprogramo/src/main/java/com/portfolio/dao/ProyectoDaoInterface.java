package com.portfolio.dao;

import com.portfolio.domain.Proyecto;
import org.springframework.data.repository.CrudRepository;

public interface ProyectoDaoInterface extends CrudRepository<Proyecto, Long> {
    
}
