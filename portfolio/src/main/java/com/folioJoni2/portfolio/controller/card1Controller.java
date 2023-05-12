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
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
    
     @PutMapping ("/modificar")
    public void modificarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }   



}
    
    /*
    TK

    @PutMapping ("/modificar")
    public void modificarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }

    ---------------------el ultimo intento pero no salio--------------------------- 
  @PutMapping ("/modificar/{id}")
    public Persona modificarPersona (@PathVariable Long id, String nombreYapellido, String fondo, String fotoPersona, String oficio, String contactoLink, String logoDerecha, String textoDerecho, String acercaDeMi) {
         Persona per= persoServ.modificarPersona(id);
         
         return per;
        } 

    ---------------------------------------------------------------
devuelve lista pero no modifica y la otra forma del Mod8 el PUT se rompe
    -----------------------------------------------------------------

     para q devuelva un cartelito diciendo q se creo bien, solo cambiar:
    public void a string y al final poner ese return, y asi 
    con los demas si queremos cartelito
    
    @PostMapping ("/new/persona")
    public String agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return  "Se creo una persona correctamente";
    }



    ---------------------------------------------------------------
    el q va editar abajo
    -----------------------------------------------------------------
    editar:
    
    @PutMapping ("/modificar/{id}")
    public Persona modificarPersona (@PathVariable Long id){
        return persoServ.modificarPersona(id);
        }
    
    
    ---------------------------------------------------------------
    el anterior abajo
    -----------------------------------------------------------------
    @PutMapping ("/modificar/persona")
    public void modificarPersona (@RequestBody Persona pers) {
        persoServ.modificarPersona(pers);
    }
    */
    
    
    
    //edit sera igual a save que si lo encuentra por id lo modifica, si no hay ninguno lo crea

