package com.ajnunez.ms_vehiculos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipos_motor")
@Getter
@Setter
public class Tipo_motorEntity {
    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "nombre")
    String nombre;
}
