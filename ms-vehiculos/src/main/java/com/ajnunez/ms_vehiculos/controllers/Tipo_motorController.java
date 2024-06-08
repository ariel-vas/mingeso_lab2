package com.ajnunez.ms_vehiculos.controllers;

import com.ajnunez.ms_vehiculos.entities.Tipo_motorEntity;
import com.ajnunez.ms_vehiculos.models.CrearTipo;
import com.ajnunez.ms_vehiculos.services.Tipo_motorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class Tipo_motorController {
    Tipo_motorService tipo_motorService;

    @Autowired
    public Tipo_motorController(Tipo_motorService tipo_motorService) {
        this.tipo_motorService = tipo_motorService;
    }

    @GetMapping("/tipo_motores")
    List<Tipo_motorEntity> getTipo_motores() {return tipo_motorService.getTipo_motores();}

    @GetMapping("/tipo_motores/{id_tipo_motor}")
    Optional<Tipo_motorEntity> getTipo_motorById(@PathVariable Integer id_tipo_motor)
    {
        return tipo_motorService.getTipo_motor(id_tipo_motor);
    }

    @PostMapping("/tipo_motores")
    Tipo_motorEntity createTipo_motor(@RequestBody CrearTipo body)
    {
        System.out.println(body);
        return tipo_motorService.saveTipo_motor(body);
    }

    @DeleteMapping("/tipo_motores/{id_tipo_motor}")
    ResponseEntity<String> deleteTipo_motor(@PathVariable Integer id_tipo_motor)
    {
        tipo_motorService.deleteTipo_motor(id_tipo_motor);
        return new ResponseEntity<>
                (
                        "Vehículo" + id_tipo_motor + "eliminado satisfactoriamente.",
                        HttpStatus.OK
                );
    }

}
