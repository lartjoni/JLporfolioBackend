package com.folioJoni2.portfolio.repository;

import com.folioJoni2.portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
    
}
