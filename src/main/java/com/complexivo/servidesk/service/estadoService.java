package com.complexivo.servidesk.service;

import java.util.List;

import com.complexivo.servidesk.models.estado;
import com.complexivo.servidesk.repository.estadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class estadoService {
    @Autowired
    private estadoRepository estadoRepository;

    public List<estado> listarEstados(){
        return estadoRepository.findAll();
    }

    public estado crearEstado(estado estado){
        if(estadoRepository.findByNombreEstado(estado.getNombreEstado())!= null){
            return new estado();
    
        }
        return estadoRepository.save(estado);
    }


    

}

