package com.complexivo.servidesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complexivo.servidesk.models.preguntas;
import java.util.Optional;

@Repository
public interface preguntasRepository extends JpaRepository<preguntas, Long>{
    public Optional<preguntas>findByCodPregunta(Long id);

    preguntas findByPregunta(String Pregunta);
}
