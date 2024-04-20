package com.upc.grupo2.backendhungerfood.services;

import com.upc.grupo2.backendhungerfood.repository.ComprobanteTransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprobanteTransaccionService {
    @Autowired
    private ComprobanteTransaccionRepository comprobanteTransaccionRepository;

}
