/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.repository;
import com.complexivo.servidesk.models.catalogo;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author AlexanderGuzman
 */
public interface catalogoRepository extends JpaRepository<catalogo, Long> {

    catalogo findByCategoria(String categoria);

    catalogo findByCodCatalogo(Long codCatalogo);
    
}
