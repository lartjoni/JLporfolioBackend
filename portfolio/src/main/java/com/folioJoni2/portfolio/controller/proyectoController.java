package com.folioJoni2.portfolio.controller;

import com.folioJoni2.portfolio.model.Proyecto;
import com.folioJoni2.portfolio.service.IProyectoService;
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
public class proyectoController {

    @Autowired
    private IProyectoService proyeServ;

    @PostMapping ("/proyecto/new")
    public String agregarProyecto (@RequestBody Proyecto proy) {
        proyeServ.crearProyecto(proy);
        return "se creo un proyecto correctamente";
    }
    
     @GetMapping ("/proyecto/ver")
    @ResponseBody
    public List<Proyecto> verProyectos () {
        return proyeServ.verProyectos();
    }
    
    @DeleteMapping ("/proyecto/delete/{id}")
    public String borrarProyecto (@PathVariable Long id) {
            proyeServ.borrarProyecto(id);
        return "el proyecto se elimino correctamente";
    }
    
     @GetMapping ("/proyecto/buscar/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable Long id) {
        return proyeServ.buscarProyecto(id);
    }
    
    @PutMapping ("/proyecto/modificar")
    public String modificarProyecto (@RequestBody Proyecto proy) {
        proyeServ.crearProyecto(proy);
        return "el proyecto se modifico";
    }  
    
    
}
