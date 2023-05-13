package com.folioJoni2.portfolio.repository;

import com.folioJoni2.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}
