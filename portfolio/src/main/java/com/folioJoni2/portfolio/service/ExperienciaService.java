package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Experiencia;
import com.folioJoni2.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository experRepo;    
    
    @Override
    public List<Experiencia> verExperiencias() {
        return experRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
         experRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return experRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia expe) {
        experRepo.save(expe);
    }

    
}
