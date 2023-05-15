package com.folioJoni2.portfolio.controller;

import com.folioJoni2.portfolio.model.Experiencia;
import com.folioJoni2.portfolio.service.IExperienciaService;
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
public class experienciaController {
    
    @Autowired
    private IExperienciaService experServ;
    
    @PostMapping ("/experiencia/new")
    public String agregarExperiencia (@RequestBody Experiencia expe) {
        experServ.crearExperiencia(expe);
        return "se creo una experiencia correctamente";
    }
    
    @GetMapping ("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias () {
        return experServ.verExperiencias();
    }
    
    @DeleteMapping ("/experiencia/delete/{id}")
    public String borrarExperiencia (@PathVariable Long id) {
            experServ.borrarExperiencia(id);
        return "la experiencia se elimino correctamente";
    }
    
     @GetMapping ("/experiencia/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id) {
        return experServ.buscarExperiencia(id);
    }
    
    @PutMapping ("/experiencia/modificar")
    public String modificarExperiencia (@RequestBody Experiencia expe) {
        experServ.crearExperiencia(expe);
        return "la experiencia se modifico";
    }  
    
    
    
    
}
