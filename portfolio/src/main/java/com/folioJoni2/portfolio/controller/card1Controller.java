package com.folioJoni2.portfolio.controller;

import com.folioJoni2.portfolio.model.Persona;
import com.folioJoni2.portfolio.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class card1Controller {

  
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public String agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "se creo una persona correctamente";
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public String borrarPersona (@PathVariable Long id) {
            persoServ.borrarPersona(id);
        return "la persona se elimino correctamente";
    }
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
    
     @PutMapping ("/modificar")
    public String modificarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "la persona se modifico";
    }   



}
  

