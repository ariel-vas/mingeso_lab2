package com.ajnunez.ms_reparaciones.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reparaciones")
@Getter
@Setter
public class ReparacionEntity {
    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "gasolina")
    Integer gasolina;

    @Column(name = "diésel")
    Integer diesel;

    @Column(name = "híbrido")
    Integer hibrido;

    @Column(name = "eléctrico")
    Integer electrico;
}
