package com.ajnunez.ms_vehiculos.components;

import com.ajnunez.ms_vehiculos.entities.Tipo_vehiculoEntity;
import com.ajnunez.ms_vehiculos.repositories.Tipo_vehiculoRepository;
import jakarta.annotation.PostConstruct;

import java.util.Arrays;
import java.util.List;

public class Tipo_vehiculoComponent {
    private final Tipo_vehiculoRepository tipo_vehiculoRepository;

    public Tipo_vehiculoComponent(Tipo_vehiculoRepository tipo_vehiculoRepository){
        this.tipo_vehiculoRepository = tipo_vehiculoRepository;
    }

    @PostConstruct
    public void initData() {
        Tipo_vehiculoEntity tipo1 = new Tipo_vehiculoEntity();
        tipo1.setNombre("Sedan");
        Tipo_vehiculoEntity tipo2 = new Tipo_vehiculoEntity();
        tipo2.setNombre("Hatchback");
        Tipo_vehiculoEntity tipo3 = new Tipo_vehiculoEntity();
        tipo3.setNombre("SUV");
        Tipo_vehiculoEntity tipo4 = new Tipo_vehiculoEntity();
        tipo4.setNombre("Pickup");
        Tipo_vehiculoEntity tipo5 = new Tipo_vehiculoEntity();
        tipo5.setNombre("Furgoneta");

        List<Tipo_vehiculoEntity> tiposVehiculo = Arrays.asList(tipo1, tipo2, tipo3, tipo4, tipo5);
        tipo_vehiculoRepository.saveAll(tiposVehiculo);
    }
}
