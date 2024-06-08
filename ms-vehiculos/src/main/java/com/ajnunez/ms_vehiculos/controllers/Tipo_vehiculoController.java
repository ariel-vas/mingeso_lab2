package com.ajnunez.ms_vehiculos.controllers;

import com.ajnunez.ms_vehiculos.entities.Tipo_vehiculoEntity;
import com.ajnunez.ms_vehiculos.models.CrearTipo;
import com.ajnunez.ms_vehiculos.services.Tipo_vehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class Tipo_vehiculoController {
    Tipo_vehiculoService tipo_vehiculoService;

    @Autowired
    public Tipo_vehiculoController(Tipo_vehiculoService tipo_vehiculoService) {
        this.tipo_vehiculoService = tipo_vehiculoService;
    }

    @GetMapping("/tipo_vehiculos")
    List<Tipo_vehiculoEntity> getTipo_Vehiculos() {return tipo_vehiculoService.getTipo_vehiculos();}

    @GetMapping("/tipo_vehiculos/{id_tipo_vehiculo}")
    Optional<Tipo_vehiculoEntity> getTipo_vehiculoById(@PathVariable Integer id_tipo_vehiculo)
    {
        return tipo_vehiculoService.getTipo_vehiculo(id_tipo_vehiculo);
    }

    @PostMapping("/tipo_vehiculos")
    Tipo_vehiculoEntity createTipo_Vehiculo(@RequestBody CrearTipo body)
    {
        System.out.println(body);
        return tipo_vehiculoService.saveTipo_vehiculo(body);
    }

    @DeleteMapping("/tipo_vehiculos/{id_tipo_vehiculo}")
    ResponseEntity<String> deleteTipo_vehiculo(@PathVariable Integer id_tipo_vehiculo)
    {
        tipo_vehiculoService.deleteTipo_vehiculo(id_tipo_vehiculo);
        return new ResponseEntity<>
                (
                        "Tipo de vehículo" + id_tipo_vehiculo + "eliminado satisfactoriamente.",
                        HttpStatus.OK
                );
    }

}
