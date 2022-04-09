package com.complexivo.servidesk.service;

import java.util.List;
import java.util.Optional;

import com.complexivo.servidesk.controllers.prioridadController;
import com.complexivo.servidesk.models.prioridad;
import com.complexivo.servidesk.repository.prioridadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class prioridadService {

        @Autowired
        private prioridadRepository    prioridadrepo;
        
        public List<prioridad> listar(){
            return this.prioridadrepo.findAll();
        }
        public prioridad nuevo(prioridad p){
            return this.prioridadrepo.save(p);
        }
        public Optional<prioridad> Buscar(Long id){
            return this.prioridadrepo.findBycodsolucion(id);
        }
        
        public void ELiminar(Long id){
            this.prioridadrepo.deleteById(id);
        }
    }
    
    
}
