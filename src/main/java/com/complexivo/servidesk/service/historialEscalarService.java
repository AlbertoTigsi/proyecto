/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.service;

import com.complexivo.servidesk.models.HistorialEscalar;
import com.complexivo.servidesk.repository.historialEscalarRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class historialEscalarService {
    @Autowired
    private historialEscalarRepository repo;
    
    public HistorialEscalar crear(HistorialEscalar data ){
         return this.repo.save(data);
    }
    
    public Optional<HistorialEscalar> BuscarByTicket(Long codticket){
        return this.repo.buscarByTicket(codticket);
    }
    public List<HistorialEscalar> listar(){
        return this.repo.findAll();
    }
}
