package com.upc.grupo2.backendhungerfood.services;

import com.upc.grupo2.backendhungerfood.entities.Donante;
import com.upc.grupo2.backendhungerfood.repository.DonanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DonanteService {
    @Autowired
    private DonanteRepository donanteRepository;
    public Donante insert (Donante donante){
        return donanteRepository.save(donante);
    }
    public List<Donante> list(){
        return donanteRepository.findAll();
    }
    public Donante searchId(Long id) throws Exception{
        return donanteRepository.findById(id).orElseThrow(() -> new Exception("No se encientro"));
    }
    public Donante save(Donante author) throws Exception {
        // authorRepository.findById(author.getId()).orElseThrow(() -> new Exception("No existe"));
        searchId(author.getId());
        return donanteRepository.save(author);
    }
    public Donante delete(Long id) throws Exception{
        Donante a;
        a = searchId(id);
        donanteRepository.deleteById(id);
        return a;
    }
}
