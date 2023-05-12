package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {

    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
}
