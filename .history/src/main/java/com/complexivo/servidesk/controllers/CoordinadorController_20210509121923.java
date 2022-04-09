/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.controllers;

import com.complexivo.servidesk.models.Coordinador;
import com.complexivo.servidesk.repository.CoordinadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jessica Alvarez
 */
@RestController
public class CoordinadorController {
    
    @Autowired
    private CoordinadorRepository coordinadorrepository;
    
    @GetMapping("/listaCoordinadores")
    public List<Coordinador>getAllCoordinador(){
        return coordinadorrepository.findAll();
    } 
    
    
    
}
