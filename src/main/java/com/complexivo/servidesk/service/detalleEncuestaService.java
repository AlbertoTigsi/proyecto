/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.service;

import com.complexivo.servidesk.models.detalleEncuesta;
import com.complexivo.servidesk.repository.detalleEncuestaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class detalleEncuestaService {
    @Autowired
    private detalleEncuestaRepository detallEncuestaRepository;

    public List<detalleEncuesta> listar(){
        return this.detallEncuestaRepository.findAll();
    }

    public detalleEncuesta nuevo(detalleEncuesta detalle){
        return this.detallEncuestaRepository.save(detalle);
    }

    public Optional<detalleEncuesta> buscar(Long id){
        return this.detallEncuestaRepository.findByCodDetalle(id);
    }

    public void Eliminar(Long id){
        this.detallEncuestaRepository.deleteById(id);
    }

    public List<detalleEncuesta> llamarP(Long cod_encuesta){
      return this.detallEncuestaRepository.llamarPreguntas(cod_encuesta);
    }
}
