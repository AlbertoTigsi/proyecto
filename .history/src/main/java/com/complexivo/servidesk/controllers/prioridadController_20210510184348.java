package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.prioridad;
import com.complexivo.servidesk.repository.prioridadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prioridad")
public class prioridadController {

    @Autowired
    prioridadRepository prioridadRepos;
    
   
    @RequestMapping("/listar")
    public List<prioridad> listar() {
        return  this.prioridadRepos.findAll();
        
    }


    @RequestMapping("/guardar")
    public prioridad guardar(@RequestBody prioridad p) {
        return this.prioridadRepos.save(p);
    }

    
    @GetMapping("/{codprioridad}")
    public void buscar(@PathVariable Long codPrioridad) {
        this.prioridadRepos.findById(codPrioridad);
    }
    
 
    
    @DeleteMapping("/{codPrioridad}")
    public void eliminar(@PathVariable Long codPrioridad) {
        prioridadRepos.deleteById(codPrioridad);
    }
    
   
}