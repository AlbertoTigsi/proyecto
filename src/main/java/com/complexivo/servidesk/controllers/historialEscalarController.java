/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.controllers;

import com.complexivo.servidesk.models.HistorialEscalar;
import com.complexivo.servidesk.service.historialEscalarService;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author HP
 */

@RestController
@RequestMapping("historialEscalar")
public class historialEscalarController {
    @Autowired
    historialEscalarService service;
    
    @GetMapping("/listar")
    @CrossOrigin
    public List<HistorialEscalar> listar(){
        return this.service.listar();
    }
    
    @PostMapping("/guardar")
    @CrossOrigin
    public HistorialEscalar guardar(@RequestBody HistorialEscalar data){
        return this.service.crear(data); 
    }
    
    @GetMapping("/buscarByTicket/{codticket}")
    public Optional<HistorialEscalar>listarByTicket(@PathVariable Long codticket){
        return this.service.BuscarByTicket(codticket);
    }
}
