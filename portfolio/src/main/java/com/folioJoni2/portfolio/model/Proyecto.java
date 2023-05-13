package com.folioJoni2.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;   
    
    private String nombreProye;
    private String descriProye;
    private String direUrlProye;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombreProye, String descriProye, String direUrlProye) {
        this.id = id;
        this.nombreProye = nombreProye;
        this.descriProye = descriProye;
        this.direUrlProye = direUrlProye;
    }
    
    
}
