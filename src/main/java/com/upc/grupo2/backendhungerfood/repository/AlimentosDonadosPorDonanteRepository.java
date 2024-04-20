package com.upc.grupo2.backendhungerfood.repository;

import com.upc.grupo2.backendhungerfood.entities.AlimentosDonadosPorDonante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentosDonadosPorDonanteRepository extends JpaRepository<AlimentosDonadosPorDonante, Long>{
}
