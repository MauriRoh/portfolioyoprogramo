package com.portfolio.dao;

import com.portfolio.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoInterface extends CrudRepository<Persona, Long> {
    
}
