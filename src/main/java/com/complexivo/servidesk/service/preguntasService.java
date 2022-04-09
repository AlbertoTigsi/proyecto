/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.service;

import com.complexivo.servidesk.models.preguntas;
import com.complexivo.servidesk.repository.preguntasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class preguntasService {
    @Autowired
    private preguntasRepository pregunRepository;
    
    public List<preguntas> Listar(){
        return this.pregunRepository.findAll();
    }
    
    public preguntas Nuevo(preguntas preguntas){
        if(pregunRepository.findByPregunta(preguntas.getPregunta())==null){
            return this.pregunRepository.save(preguntas);
        }
        return new preguntas();
       
    }
    
    public Optional<preguntas> Buscar(Long id){
        return this.pregunRepository.findByCodPregunta(id);
    }
    
    public void Eliminar(Long id){
        this.pregunRepository.deleteById(id);
    }

    public preguntas actualizar(Long codPregunta,preguntas pregunta){
        if(pregunRepository.findByCodPregunta(codPregunta)!=null){
            if(pregunRepository.findByPregunta(pregunta.getPregunta())==null){
                pregunta.setCodPregunta(codPregunta);
                return pregunRepository.save(pregunta);
            }  
        }
        return null;
    }
}
