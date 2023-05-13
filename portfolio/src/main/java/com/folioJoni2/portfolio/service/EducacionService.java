package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Educacion;
import com.folioJoni2.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository educaRepo;
    
    @Override
    public List<Educacion> verEducaciones() {
        return educaRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educ) {
        educaRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Long id) {
         educaRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
         return educaRepo.findById(id).orElse(null); 
    }

    @Override
    public void modificarEducacion(Educacion educ) {
         educaRepo.save(educ);
    }

    
}
