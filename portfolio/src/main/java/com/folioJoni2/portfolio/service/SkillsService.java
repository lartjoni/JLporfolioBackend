package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Skills;
import com.folioJoni2.portfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{

    @Autowired
    public SkillsRepository skillRepo; 
    
    @Override
    public List<Skills> verSkills() {
       return skillRepo.findAll();
    }

    @Override
    public void crearSkills(Skills skil) {
        skillRepo.save(skil);
    }

    @Override
    public void borrarSkills(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarSkills(Skills skil) {
        skillRepo.save(skil);
    }
    
}
