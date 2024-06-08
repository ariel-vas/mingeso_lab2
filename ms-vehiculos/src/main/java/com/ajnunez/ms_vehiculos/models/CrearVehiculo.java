package com.ajnunez.ms_vehiculos.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CrearVehiculo {
    String patente;
    String marca;
    String modelo;
    Integer tipo_vehiculo;
    Integer anio_fabricacion;
    Integer tipo_motor;
    Integer asientos;
    Integer kilometraje;
}
