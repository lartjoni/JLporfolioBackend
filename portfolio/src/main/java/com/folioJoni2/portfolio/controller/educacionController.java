package com.folioJoni2.portfolio.controller;

import com.folioJoni2.portfolio.model.Educacion;
import com.folioJoni2.portfolio.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class educacionController {

  @Autowired
    private IEducacionService educaServ; 

  
    @PostMapping ("/educacion/new")
    public String agregarEducacion (@RequestBody Educacion educ) {
        educaServ.crearEducacion(educ);
        return "se creo una educacion correctamente";
    }
    
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducaciones () {
        return educaServ.verEducaciones();
    }
    
    @DeleteMapping ("/educacion/delete/{id}")
    public String borrarEducacion (@PathVariable Long id) {
            educaServ.borrarEducacion(id);
        return "la educacion se elimino correctamente";
    }
    
    @GetMapping ("/educacion/buscar/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Long id) {
        return educaServ.buscarEducacion(id);
    }
    
     @PutMapping ("/educacion/modificar")
    public String modificarEducacion (@RequestBody Educacion educ) {
        educaServ.crearEducacion(educ);
        return "la educacion se modifico";
    } 
    
    
    
}
