package com.upc.grupo2.backendhungerfood.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ComprobanteTransaccion {
    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comprobanteTransaccion_id")
    private Long id;

    //Monto total de transaccion en comprobante
    @Column(name = "Monto_total", nullable = false)
    private Double montoTotal;
}
