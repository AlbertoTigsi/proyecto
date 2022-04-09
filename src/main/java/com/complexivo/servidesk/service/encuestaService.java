/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.service;

import com.complexivo.servidesk.models.encuesta;
import com.complexivo.servidesk.repository.encuestaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class encuestaService {
    @Autowired
    private encuestaRepository encuestaRepository;
    
    public List<encuesta> listar(){
        return this.encuestaRepository.findAll();
    }
    public encuesta nuevo(encuesta e){
        return this.encuestaRepository.save(e);
    }
    public Optional<encuesta> Buscar(Long id){
        return this.encuestaRepository.findByCodEncuesta(id);
    }
    
    public void ELiminar(Long id){
        this.encuestaRepository.deleteById(id);
    }
}
