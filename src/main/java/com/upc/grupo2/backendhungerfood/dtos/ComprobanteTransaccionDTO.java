package com.upc.grupo2.backendhungerfood.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComprobanteTransaccionDTO {
    private Long id;
    private Double montoTotal;
}
