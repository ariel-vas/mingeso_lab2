package com.ajnunez.ms_vehiculos.controllers;

import com.ajnunez.ms_vehiculos.entities.VehiculoEntity;
import com.ajnunez.ms_vehiculos.models.CrearVehiculo;
import com.ajnunez.ms_vehiculos.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app")
public class VehiculoController {
    VehiculoService vehiculoService;

    @Autowired
    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping("/vehiculos")
    List<VehiculoEntity> getVehiculos() {return vehiculoService.getVehiculos();}

    @GetMapping("/vehiculos/{patenteVehiculo}")
    Optional<VehiculoEntity> getVehiculoByPatente(@PathVariable String patenteVehiculo)
    {
        return vehiculoService.getVehiculoByPatente(patenteVehiculo);
    }

    @PostMapping("/vehiculos/registrar")
    VehiculoEntity createVehiculo(@RequestBody CrearVehiculo body)
    {
        System.out.println(body);
        return vehiculoService.saveVehiculo(body);
    }

    @PutMapping("/vehiculos/{patenteVehiculo}")
    VehiculoEntity updateVehiculo(@PathVariable String patenteVehiculo,
                                  @RequestBody VehiculoEntity nuevoVehiculo)
    {
        return vehiculoService.updateVehiculo(patenteVehiculo, nuevoVehiculo);
    }

    @DeleteMapping("/vehiculos/{patente}")
    ResponseEntity<String> deleteVehiculo(@PathVariable String patente)
    {
        vehiculoService.deleteVehiculo(patente);
        return new ResponseEntity<>
                (
                        "Vehículo" + patente + "eliminado satisfactoriamente.",
                        HttpStatus.OK
                );
    }

}
