package com.upc.grupo2.backendhungerfood.controller;

import com.upc.grupo2.backendhungerfood.services.AlimentosDonadosPorDonanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HungerFood")
public class AlimentosDonadosPorDonanteController {
    @Autowired
    private AlimentosDonadosPorDonanteService alimentosDonadosPorDonanteService;

}
