package com.upc.grupo2.backendhungerfood.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Donante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 60, nullable = false)
    private String Nombre;
    @Column(length = 60, nullable = false)
    private String Apellido;
    @Column(length = 60,nullable = false)
    private String Correo;
    @Column(length = 60,nullable = false)
    private String Contrasenia;
}
