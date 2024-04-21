package com.upc.grupo2.backendhungerfood.controller;

import com.upc.grupo2.backendhungerfood.dtos.ComprobanteTransaccionDTO;
import com.upc.grupo2.backendhungerfood.entities.ComprobanteTransaccion;
import com.upc.grupo2.backendhungerfood.services.ComprobanteTransaccionService;
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
public class ComprobanteTransaccionController {
    @Autowired
    private ComprobanteTransaccionService comprobanteTransaccionService;

    @GetMapping("/MontoTransaccion/{id}")
    public ResponseEntity<ComprobanteTransaccionDTO> getMontoTransaccion(@PathVariable("id") Long id){
        Double transaccion;
        ComprobanteTransaccionDTO transaccionDTO;
        try{
            transaccion = comprobanteTransaccionService.getMontoTransaccionByUsuarioId(id);
            ModelMapper modelMapper = new ModelMapper();
            transaccionDTO = modelMapper.map(transaccion, ComprobanteTransaccionDTO.class);
            return new ResponseEntity<>(transaccionDTO, HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error al obtener monto de transaccion de usario");
        }
    }
}
