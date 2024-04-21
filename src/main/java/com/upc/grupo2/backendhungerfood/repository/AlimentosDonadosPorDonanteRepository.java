package com.upc.grupo2.backendhungerfood.repository;

import com.upc.grupo2.backendhungerfood.entities.AlimentosDonadosPorDonante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentosDonadosPorDonanteRepository extends JpaRepository<AlimentosDonadosPorDonante, Long>{
    @Query("SELECT SUM(ad.cantidadAlimentos) FROM AlimentosDonadosPorDonante ad WHERE ad.usuario.id = :usuarioId")
    Long findTotalAlimentosDonadosByUsuarioId(@Param("usuarioId") Long usuarioId);
}
