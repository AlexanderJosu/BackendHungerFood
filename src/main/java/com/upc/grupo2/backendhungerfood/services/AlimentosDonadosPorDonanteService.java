package com.upc.grupo2.backendhungerfood.services;

import com.upc.grupo2.backendhungerfood.repository.AlimentosDonadosPorDonanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlimentosDonadosPorDonanteService {
    @Autowired
    private AlimentosDonadosPorDonanteRepository alimentosDonadosPorDonanteRepository;

}
