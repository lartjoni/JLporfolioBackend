package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {

    public List<Experiencia> verExperiencias ();
    
    public void crearExperiencia (Experiencia expe);
    
    public void borrarExperiencia (Long id);
    
    public Experiencia buscarExperiencia (Long id);
    
    public void modificarExperiencia (Experiencia expe);
}
