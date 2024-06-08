package com.ajnunez.ms_vehiculos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipos_vehiculo")
@Getter
@Setter
public class Tipo_vehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "nombre")
    String nombre;

}
