package com.ajnunez.ms_vehiculos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehiculos")
@Getter
@Setter
public class VehiculoEntity {
    @Id
    @Column(name = "patente")
    String patente;

    @Column(name = "marca")
    String marca;

    @Column(name = "modelo")
    String modelo;

    @Column(name = "tipo_vehiculo")
    Integer tipo_vehiculo;

    @Column(name = "anio_fabricacion")
    Integer anio_fabricacion;

    @Column(name = "tipo_motor")
    Integer tipo_motor;

    @Column(name = "asientos")
    Integer asientos;

    @Column(name = "kilometraje")
    Integer kilometraje;

}
