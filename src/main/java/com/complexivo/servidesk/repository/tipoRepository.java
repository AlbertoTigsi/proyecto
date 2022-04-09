package com.complexivo.servidesk.repository;

import java.util.Optional;

import com.complexivo.servidesk.models.tipo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoRepository extends JpaRepository<tipo,Long> {
    public Optional<tipo> findByCodTipo(Long codTipo);

    tipo findByNombre(String nombre);


}
