package com.complexivo.servidesk.repository;

import java.util.List;

import com.complexivo.servidesk.models.servicio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface servicioRepository extends JpaRepository<servicio , Long>, JpaSpecificationExecutor<servicio>  {
    servicio findByCodServicio(Long codServicio);    
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE servicio set cod_prioridad =?1  where cod_servicio =?2 ")
    void updateServicePrioridad(Long cod_prioridad, Long cod_servicio);

    @Query(value = " SELECT * FROM servicio WHERE cod_tipo=:codTipo AND cod_catalogo=:codCatalogo", nativeQuery = true)
    List<servicio> findServicioByTipoCatalogo(Long codTipo, Long codCatalogo);
    
    @Query(value="SELECT * FROM servicio s WHERE s.cod_catalogo = :codCatalogo ", nativeQuery = true)
    List<servicio> findservicosbyCatalogo(int codCatalogo,Pageable pageable);

    @Query(value="SELECT * FROM servicio s WHERE s.cod_catalogo = :codCatalogo order by fecha_servicio desc", nativeQuery = true)
    List<servicio> findservicosbyCategoria(int codCatalogo);
}
