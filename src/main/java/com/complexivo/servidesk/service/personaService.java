package com.complexivo.servidesk.service;

import java.util.List;

import com.complexivo.servidesk.models.persona;
import com.complexivo.servidesk.repository.personaRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService {

    @Autowired
    private personaRespository rep;


    public List<persona> listar() {
        return this.rep.findAll();
    }

    public persona buscarPersona(String cedula) {
        return this.rep.findByCedula(cedula);
    }

    public persona crearPersona(persona persona ) {
        if(rep.findByCedula(persona.getCedula())!= null){
            return new persona();
        }
        return this.rep.save(persona);
    }

    public void eliminarPersona(String cedula) {
        if(rep.findByCedula(cedula)!= null){
            rep.deleteById(cedula);
        }
    }
    
    public persona editarPersona(String cedula, persona persona) {
        if (rep.findById(cedula).isPresent()) {
            persona personaUpdate=rep.findById(cedula).get();
            personaUpdate = persona;
            return rep.save(personaUpdate);		
        }
       return persona;
    }
    public List<persona>getTecnicoPorNivel(int nivel){
        return this.rep.listarTecnicosPorNivel(nivel); 
    }
}
