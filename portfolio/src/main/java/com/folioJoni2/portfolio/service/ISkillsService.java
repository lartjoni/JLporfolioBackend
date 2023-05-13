package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List<Skills> verSkills ();
    
    public void crearSkills (Skills skil);
    
    public void borrarSkills (Long id);
    
    public Skills buscarSkills (Long id);
    
    public void modificarSkills (Skills skil);
    
    
}
