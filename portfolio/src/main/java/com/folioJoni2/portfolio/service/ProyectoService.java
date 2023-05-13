package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Proyecto;
import com.folioJoni2.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyeRepo;
    
    @Override
    public List<Proyecto> verProyectos() {
        return proyeRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proyeRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proy) {
        proyeRepo.save(proy);
    }
    
}
