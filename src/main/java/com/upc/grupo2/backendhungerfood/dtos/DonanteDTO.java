package com.upc.grupo2.backendhungerfood.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonanteDTO {
    private Long id;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Contrasenia;

}