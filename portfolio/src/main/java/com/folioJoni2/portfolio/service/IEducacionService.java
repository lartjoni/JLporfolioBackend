package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
   
    public List<Educacion> verEducaciones ();
    
    public void crearEducacion (Educacion educ);
    
    public void borrarEducacion (Long id);
    
    public Educacion buscarEducacion (Long id);
    
    public void modificarEducacion (Educacion educ);
}
