package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.coordinador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface coordinadorRepository extends JpaRepository<coordinador, Long> {
    

    public coordinador findByCodCoordinador(Long codCoordinador);

    public coordinador findByEmail(String email);

        coordinador findByEmailAndPassword(String email,String password);
    
}
