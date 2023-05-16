package com.folioJoni2.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreYapellido;
    private String fondo;
    private String fotoPersona;
    private String oficio;
    private String localidad;
    private String textoContacto;
    private String contactoLink;
    private String logoDerecha;
    private String textoDerecho;
    private String acercaDeMi;

    
    public Persona() {
    }

    
    public Persona(Long id, String nombreYapellido, String fondo,
                  String fotoPersona, String oficio, String localidad,String textoContacto, String contactoLink,
                  String logoDerecha, String textoDerecho, String acercaDeMi) {
        
        this.id = id;
        this.nombreYapellido = nombreYapellido;
        this.fondo = fondo;
        this.fotoPersona = fotoPersona;
        this.oficio = oficio;
        this.localidad = localidad;
        this.textoContacto = textoContacto;
        this.contactoLink = contactoLink;
        this.logoDerecha = logoDerecha;
        this.textoDerecho = textoDerecho;
        this.acercaDeMi = acercaDeMi;
    }
    
    
    
    
}
