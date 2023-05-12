package com.folioJoni2.portfolio.repository;

import com.folioJoni2.portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{


    
}
