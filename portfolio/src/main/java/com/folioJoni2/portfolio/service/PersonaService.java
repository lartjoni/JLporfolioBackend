package com.folioJoni2.portfolio.service;

import com.folioJoni2.portfolio.model.Persona;
import com.folioJoni2.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

@Override
    public Persona modificarPersona(Long id) {
        Persona per = persoRepo.findById(id).orElse(null);
       persoRepo.save(per);
       return per;
    }
    
    /*
    @Override
    public Persona modificarPersona(Long id) {
        per.setNombreYapellido(nombreYapellido);
        per.setFondo(fondo);
        per.setFotoPersona(fotoPersona);
        per.setOficio(oficio);
        per.setContactoLink(contactoLink);
        per.setLogoDerecha(logoDerecha);
        per.setTextoDerecho(textoDerecho);
        per.setAcercaDeMi(acercaDeMi);
    
        persoRepo.save(per);
    }
    
    -----------------------------------------------
    @PutMapping ("/modificar/{id}")
    public Persona modificarPersona (@PathVariable Long id){
        return persoServ.modificarPersona(id);
        }
    
    -----------------------------------------------
    -----------------------------------------------
    @Override
    public void modificarPersona(Persona per) {
     persoRepo.save(per);
    }
    
    
    */
    
    
    
}
