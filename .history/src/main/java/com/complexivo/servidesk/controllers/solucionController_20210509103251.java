package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.solucion;
import com.complexivo.servidesk.repository.solucionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solucion")
public class solucionController {

    @Autowired
    solucionRepository solucionResp;
    
  
    @RequestMapping("/listar")
    public List<solucion> listar() {
        return this.solucionResp.findAll();
    }

   
    @GetMapping("/{codsolucion}")
    public void buscarUsuario(@PathVariable Long codSolucion) {
        this.solucionResp.findById(codSolucion);
    }
    
    @RequestMapping("/guardar")
    public solucion guardar(@RequestBody solucion c) {
        return this.solucionResp.save(c);
    }
    
    
    @DeleteMapping("/{codsolucion}")
    public void eliminar(@PathVariable Long codSolucion) {
        solucionResp.deleteById(codSolucion);
    }
   
}
