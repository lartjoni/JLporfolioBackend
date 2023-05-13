package com.folioJoni2.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreHabili;
    private Long barraProgreso;

    
    public Skills() {
    }

    
    public Skills(Long id, String nombreHabili, Long barraProgreso) {
        this.id = id;
        this.nombreHabili = nombreHabili;
        this.barraProgreso = barraProgreso;
    }

    
}
