package com.complexivo.servidesk.service;

import java.util.List;

import com.complexivo.servidesk.models.coordinador;
import com.complexivo.servidesk.repository.coordinadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class coordinadorService {

    @Autowired
    private coordinadorRepository coordinadorRepository;

    
    public List<coordinador> listarCoordinadores(){
        return coordinadorRepository.findAll();
    }
    
    public coordinador crearCoordinador(coordinador coordinador){
        if(coordinadorRepository.findByCodCoordinador(coordinador.getCodCoordinador())!= null 
        &&
        coordinadorRepository.findByEmail(coordinador.getEmail())!= null){
            return new coordinador();
        }
        return coordinadorRepository.save(coordinador);
    }
    
    public void eliminarCoordinador(Long codCoordinador){
        if(coordinadorRepository.findByCodCoordinador(codCoordinador)!= null){
            coordinadorRepository.deleteById(codCoordinador);
        }
        
    }
    
    public coordinador buscarPorId(Long codCoordinador){
        return coordinadorRepository.findByCodCoordinador(codCoordinador);
    }
    
    public coordinador actualizarCoordinador(coordinador coordinador, Long codCoordinador){
        if(coordinadorRepository.findByCodCoordinador(codCoordinador)!= null){
            coordinador.setCodCoordinador(codCoordinador);
            return coordinadorRepository.save(coordinador);
        }
       return null;
    }
     public coordinador loginCoordinador(String email,String contrasena){
        return this.coordinadorRepository.findByEmailAndPassword(email, contrasena);
    }
}
