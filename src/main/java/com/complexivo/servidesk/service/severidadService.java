package com.complexivo.servidesk.service;

import java.util.List;

import com.complexivo.servidesk.models.severidad;
import com.complexivo.servidesk.repository.severidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class severidadService {

    @Autowired
    private severidadRepository severidadrepository;

    public severidad agregarseveridad(severidad severidad) {

        if (severidadrepository.findByNivelSeveridad(severidad.getNivelSeveridad()) != null) {
            return new severidad();
        }

        return severidadrepository.save(severidad);
    }

    public List<severidad> recuperarSeveridades() {
        return severidadrepository.findAll();
    }

    public severidad recuperarSeveridad(Long codSeveridad) {
        return severidadrepository.findByCodSeveridad(codSeveridad);
    }

    public severidad actualizarSeveridad(severidad severidad, Long codSeveridad) {
		if (severidadrepository.findByCodSeveridad(codSeveridad) != null) {
			if (severidadrepository.findByNivelSeveridad(severidad.getNivelSeveridad()) == null) {
				severidad.setCodSeveridad(codSeveridad);
				return severidadrepository.save(severidad);
			}
			return null;
		}
		return null;
	}

	public String eliminarSeveridad(Long codSeveridad) {
		if (severidadrepository.findByCodSeveridad(codSeveridad) != null) {
			severidadrepository.deleteById(codSeveridad);
			return "Severidad con  codigo " + codSeveridad + " ha sido eliminado";
		}
		return "No se ha encontrado una severidad con el codigo ingresado";
	}

	public severidad findByNivelSeveridad(String nivelSeveridad){
		return this.severidadrepository.findByNivelSeveridad(nivelSeveridad);
	}
}
