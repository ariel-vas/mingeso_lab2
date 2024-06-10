package com.ajnunez.ms_reparaciones.controllers;

import com.ajnunez.ms_reparaciones.entities.ReparacionEntity;
import com.ajnunez.ms_reparaciones.services.ReparacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app")
public class ReparacionController {
    ReparacionService reparacionService;

    @Autowired
    public ReparacionController(ReparacionService reparacionService) {
        this.reparacionService = reparacionService;
    }

    @GetMapping("/reparaciones")
    List<ReparacionEntity> getReparaciones() {return reparacionService.getReparaciones();}

    @GetMapping("/reparaciones/{id}")
    Optional<ReparacionEntity> getReparacionById(@PathVariable Integer id)
    {
        return reparacionService.getReparacionById(id);
    }

    //@PostMapping("/reparaciones/registrar")
    //ReparacionEntity createReparacion(@RequestBody CrearReparacion body)
    //{
    //    System.out.println(body);
    //    return reparacionService.saveReparacion(body);
    //}

    @PutMapping("/reparaciones/{id}")
    ReparacionEntity updateReparacion(@PathVariable Integer id,
                                  @RequestBody ReparacionEntity nuevaReparacion)
    {
        return reparacionService.updateReparacion(id, nuevaReparacion);
    }

    @DeleteMapping("/vehiculos/{id}")
    ResponseEntity<String> deleteVehiculo(@PathVariable Integer id)
    {
        reparacionService.deleteReparacion(id);
        return new ResponseEntity<>
                (
                        "Vehículo" + id + "eliminado satisfactoriamente.",
                        HttpStatus.OK
                );
    }

}
