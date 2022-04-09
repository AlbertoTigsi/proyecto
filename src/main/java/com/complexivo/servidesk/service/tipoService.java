package com.complexivo.servidesk.service;

import java.util.List;
import java.util.Optional;

import com.complexivo.servidesk.models.tipo;
import com.complexivo.servidesk.repository.tipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tipoService {

    @Autowired
    private tipoRepository tipoRepository;
    
    public List<tipo> listar(){
        return this.tipoRepository.findAll();
    }
    public tipo nuevo(tipo e){
        if(tipoRepository.findByNombre(e.getNombre())!=null){
            return new tipo();
        }
        return this.tipoRepository.save(e);
    }

     public Optional<tipo> Buscar(Long codTipo){
        return this.tipoRepository.findByCodTipo(codTipo);
    }
    

    public void ELiminar(Long codTipo){
        if(tipoRepository.findByCodTipo(codTipo)!= null){
            tipoRepository.deleteById(codTipo);
        }
    }

    public tipo editarTipo(Long codtipo, tipo tipo1) {
        if (tipoRepository.findById(codtipo).isPresent()) {
            tipo tipoToUpdate=tipoRepository.findById(codtipo).get();
            tipoToUpdate.setNombre(tipo1.getNombre());
            return tipoRepository.save(tipoToUpdate);		
        }
       return tipo1;
    }
    public tipo buscarPorNombre(String nombre){
        return tipoRepository.findByNombre(nombre);
    }

}
