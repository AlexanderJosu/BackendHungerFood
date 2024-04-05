package com.upc.grupo2.backendhungerfood.controller;

import com.upc.grupo2.backendhungerfood.dtos.DonanteDTO;
import com.upc.grupo2.backendhungerfood.entities.Donante;
import com.upc.grupo2.backendhungerfood.services.DonanteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class DonanteController {
    @Autowired
    private DonanteService donanteService;

    @PostMapping("/donante")
    public ResponseEntity<DonanteDTO>insert(@RequestBody DonanteDTO donanteDTO){
        //convertir AuthorDTO a Author
        ModelMapper modelMapper = new ModelMapper();
        Donante d = modelMapper.map(donanteDTO, Donante.class);
        d = donanteService.insert(d);
        //convertir Author a AuthorDTO
        donanteDTO = modelMapper.map(d,DonanteDTO.class);
        return new ResponseEntity<DonanteDTO>(donanteDTO, HttpStatus.OK);
    }
    private DonanteDTO convertToDto(Donante donante){
        ModelMapper modelMapper=new ModelMapper();
        DonanteDTO authorDTO = modelMapper.map(donante, DonanteDTO.class);
        return authorDTO;
    }

    @GetMapping("/donantes") //http://localhost:8080/api/donantes
    public ResponseEntity<List<DonanteDTO>> list(){ //wrapper
        List<Donante> l;
        List<DonanteDTO> listDto;
        try {
            l = donanteService.list();
            listDto = l.stream().map(this::convertToDto).collect(Collectors.toList());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());

        }
        return new ResponseEntity<List<DonanteDTO>>(listDto, HttpStatus.OK);
    }

    @PutMapping("/donante")
    public ResponseEntity<Donante>save(@RequestBody Donante donante) throws Exception{
        Donante a;
        try{
            a = donanteService.save(donante);

        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return new ResponseEntity<Donante>(a,HttpStatus.OK);
    }
    @DeleteMapping("/donante/{id}")
    public ResponseEntity<Donante>delete(@PathVariable(value = "id")Long id) throws Exception {
        Donante a;
        a = donanteService.delete(id);
        return new ResponseEntity<Donante>(a, HttpStatus.OK);
    }

}
