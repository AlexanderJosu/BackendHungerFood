package com.upc.grupo2.backendhungerfood.services;

import com.upc.grupo2.backendhungerfood.repository.AlimentosDonadosPorDonanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlimentosDonadosPorDonanteService {
    @Autowired
    private AlimentosDonadosPorDonanteRepository alimentosDonadosPorDonanteRepository;

    @Transactional
    public Long getCantidadAlimentosDonadosPorDonante(Long usuarioId) {
        return alimentosDonadosPorDonanteRepository.findTotalAlimentosDonadosByUsuarioId(usuarioId);
    }
}
