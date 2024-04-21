package com.upc.grupo2.backendhungerfood.repository;

import com.upc.grupo2.backendhungerfood.entities.ComprobanteTransaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobanteTransaccionRepository extends JpaRepository<ComprobanteTransaccion, Long> {
    @Query("SELECT c.montoTotal FROM ComprobanteTransaccion c WHERE c.usuario.id = :usuarioId")
    Double findMontoTransaccionByUsuarioId(Long usuarioId);
}
