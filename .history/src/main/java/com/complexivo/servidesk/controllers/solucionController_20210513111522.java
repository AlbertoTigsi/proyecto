package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.solucion;
import com.complexivo.servidesk.repository.solucionRepository;
import com.complexivo.servidesk.service.solucionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/solucion")
public class solucionController {

    @Autowired
   private solucionService solucionserv;
    
  
    @RequestMapping("/listar")
    public List<solucion> listar() {
        return this.solucionserv.findAll();
        
    }

   
    @GetMapping("/{codsolucion}")
    public void buscar(@PathVariable Long codSolucion) {
        this.solucionserv.findByIdcodsolucion(codSolucion);
    }
    
    @RequestMapping("/guardar")
    public solucion guardar(@RequestBody solucion c) {
        return this.solucionserv.save(c);
    }
    
    
    @DeleteMapping("/{codsolucion}")
    public void eliminar(@PathVariable Long codSolucion) {
        solucionserv.deleteById(codSolucion);
    }
   
}
