package com.folioJoni2.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String logoEduca;
    private String establecimEduca;
    private String puestoEduca;
    private String fechasEduca;

    
    public Educacion() {
    }

    
    public Educacion(Long id, String logoEduca, String establecimEduca, String puestoEduca, String fechasEduca) {
        this.id = id;
        this.logoEduca = logoEduca;
        this.establecimEduca = establecimEduca;
        this.puestoEduca = puestoEduca;
        this.fechasEduca = fechasEduca;
    }
    
    
}
