package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {

    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
    public void modificarPersona (Persona per);
    
  /*
    TK
    public void modificarPersona (Persona per);
    
    
   ---------------------el ultimo intento pero no salio--------------------------- 
    public Persona modificarPersona (Long id);
   ------------------------------------------------ 
    
    
    @PutMapping ("/modificar/{id}")
    public Persona modificarPersona (@PathVariable Long id){
        return persoServ.modificarPersona(id);
        }
    
    
    
    public void modificarPersona(Persona pers);
    */
    
    
}
