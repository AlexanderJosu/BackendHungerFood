package com.upc.grupo2.backendhungerfood.services;

import com.upc.grupo2.backendhungerfood.repository.ComprobanteTransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ComprobanteTransaccionService {
    @Autowired
    private ComprobanteTransaccionRepository comprobanteTransaccionRepository;

    @Transactional
    public Double getMontoTransaccionByUsuarioId(Long usuarioId) {
        return comprobanteTransaccionRepository.findMontoTransaccionByUsuarioId(usuarioId);
    }
}
