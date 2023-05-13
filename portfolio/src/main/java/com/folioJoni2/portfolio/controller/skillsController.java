package com.folioJoni2.portfolio.controller;

import com.folioJoni2.portfolio.model.Skills;
import com.folioJoni2.portfolio.service.ISkillsService;
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
public class skillsController {
  
    @Autowired
    private ISkillsService skillServ;
    
    @PostMapping ("/skills/new")
    public String agregarSkills (@RequestBody Skills skil) {
        skillServ.crearSkills(skil);
        return "se creo una skill correctamente";
    }
    
    @GetMapping ("/skills/ver")
    @ResponseBody
    public List<Skills> verSkills () {
        return skillServ.verSkills();
    }
    
    @DeleteMapping ("/skills/delete/{id}")
    public String borrarSkills (@PathVariable Long id) {
            skillServ.borrarSkills(id);
        return "la skill se elimino correctamente";
    }
    
     @GetMapping ("/skills/buscar/{id}")
    @ResponseBody
    public Skills buscarSkills(@PathVariable Long id) {
        return skillServ.buscarSkills(id);
    }
    
    @PutMapping ("/skills/modificar")
    public String modificarSkills (@RequestBody Skills skil) {
        skillServ.crearSkills(skil);
        return "la skills se modifico";
    }
    
    
    
}
