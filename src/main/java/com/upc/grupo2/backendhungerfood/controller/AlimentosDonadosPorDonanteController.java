package com.upc.grupo2.backendhungerfood.controller;

import com.upc.grupo2.backendhungerfood.dtos.AlimentosDonadosPorDonanteDTO;
import com.upc.grupo2.backendhungerfood.services.AlimentosDonadosPorDonanteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/HungerFood")
public class AlimentosDonadosPorDonanteController {
    @Autowired
    private AlimentosDonadosPorDonanteService alimentosDonadosPorDonanteService;

    @GetMapping("/AlimentosDonadosPorDonante/{usuarioId}")
    public ResponseEntity<AlimentosDonadosPorDonanteDTO> getCantidadAlimentosDonadosPorDonante(@PathVariable Long usuarioId){
        try{
            Long adDto = alimentosDonadosPorDonanteService.getCantidadAlimentosDonadosPorDonante(usuarioId);
            ModelMapper modelMapper = new ModelMapper();
            AlimentosDonadosPorDonanteDTO alimentoDonadoPorDonanteDTO = modelMapper.map(adDto, AlimentosDonadosPorDonanteDTO.class);
            return new ResponseEntity<>(alimentoDonadoPorDonanteDTO, HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error al mostrar cantidad de alimentos de usuario");
        }
    }

}
