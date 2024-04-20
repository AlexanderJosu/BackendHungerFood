package com.upc.grupo2.backendhungerfood.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AlimentosDonadosPorDonante {
    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alimentosDonadosPorDonante_id")
    private Long id;

    //Fecha de donacion
    @Column(name = "Fecha_donacion", nullable = false, unique = true)
    private LocalDate fechaDonacion;

    //Cantidad de alimentos donados
    @Column(name = "Cantidad_alimentos", nullable = false)
    private Long cantidadAlimentos;
}
