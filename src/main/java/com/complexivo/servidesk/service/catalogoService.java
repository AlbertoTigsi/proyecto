/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.service;

import com.complexivo.servidesk.repository.catalogoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.complexivo.servidesk.models.catalogo;

/**
 *
 * @author AlexanderGuzman
 */
@Service
public class catalogoService {
    @Autowired
    catalogoRepository repo;
    
    public List<catalogo> listar() {
        return this.repo.findAll();

    }
    
    public catalogo guardar( catalogo e) {
        if(repo.findByCategoria(e.getCategoria())!=null){
            return new catalogo();
        }
        return this.repo.save(e);
    }
    
    public void eliminar(Long codCatalogo) {
        if(repo.findByCodCatalogo(codCatalogo)!=null){
            this.repo.deleteById(codCatalogo);
        }
        
    }
   
    public catalogo editarEstado( Long codCatalogo,  catalogo catalogo1) {
        if (repo.findById(codCatalogo).isPresent()) {
            catalogo catalogoToUpdate=repo.findById(codCatalogo).get();
            catalogoToUpdate.setEstado(catalogo1.isEstado());
            return repo.save(catalogoToUpdate);			
        }
       return catalogo1;
    }

    public catalogo editarCategoria(Long codCatalogo, catalogo catalogo1) {
        if (repo.findById(codCatalogo).isPresent()) {
            catalogo catalogoToUpdate=repo.findById(codCatalogo).get();
            catalogoToUpdate.setCategoria(catalogo1.getCategoria());
            return repo.save(catalogoToUpdate);		
        }
       return catalogo1;
    }

    public catalogo buscarPorCategoria(String categoria){
        return repo.findByCategoria(categoria);

    }

    public catalogo actualizarCatalogo(Long codCatalogo,catalogo catalogo){
        if(repo.findByCodCatalogo(codCatalogo)!=null){
            catalogo.setCodCatalogo(codCatalogo);
            return repo.save(catalogo);
        }
        return null;
    }

    public catalogo buscarPorCodigo(Long codCatalogo){
        return repo.findByCodCatalogo(codCatalogo);
    }
}
