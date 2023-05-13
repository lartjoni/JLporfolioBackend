package com.folioJoni2.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String logoExper;
    private String establecimExper;
    private String puestoExper;
    private String fechasExper;

    
    public Experiencia() {
    }

    
    public Experiencia(Long id, String logoExper, String establecimExper, String puestoExper, String fechasExper) {
        this.id = id;
        this.logoExper = logoExper;
        this.establecimExper = establecimExper;
        this.puestoExper = puestoExper;
        this.fechasExper = fechasExper;
    }
    
  
    
}
