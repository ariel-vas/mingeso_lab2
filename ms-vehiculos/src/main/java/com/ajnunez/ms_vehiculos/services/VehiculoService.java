package com.ajnunez.ms_vehiculos.services;

import com.ajnunez.ms_vehiculos.entities.VehiculoEntity;
import com.ajnunez.ms_vehiculos.models.CrearVehiculo;
import com.ajnunez.ms_vehiculos.repositories.VehiculoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    VehiculoRepository vehiculoRepository;

    @Autowired
    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public List<VehiculoEntity> getVehiculos() { return vehiculoRepository.findAll(); }

    public Optional<VehiculoEntity> getVehiculoByPatente(String patenteVehiculo) { return vehiculoRepository.findById(patenteVehiculo); }

    @Transactional
    public VehiculoEntity saveVehiculo(CrearVehiculo body)
    {
        VehiculoEntity nuevoVehiculo = new VehiculoEntity();

        nuevoVehiculo.setPatente(body.getPatente());
        nuevoVehiculo.setMarca(body.getMarca());
        nuevoVehiculo.setModelo(body.getModelo());
        nuevoVehiculo.setTipo_vehiculo(body.getTipo_vehiculo());
        nuevoVehiculo.setAnio_fabricacion(body.getAnio_fabricacion());
        nuevoVehiculo.setTipo_motor(body.getTipo_motor());
        nuevoVehiculo.setAsientos(body.getAsientos());
        nuevoVehiculo.setKilometraje(body.getKilometraje());

        return vehiculoRepository.save(nuevoVehiculo);
    }

    public VehiculoEntity updateVehiculo(String patenteVehiculo, VehiculoEntity nuevoVehiculo)
    {
        Optional<VehiculoEntity> vehiculoOptional = vehiculoRepository.findById(patenteVehiculo);

        if(vehiculoOptional.isEmpty()){
            throw new RuntimeException("El vehículo" + patenteVehiculo + "no existe en el registro.");
        }

        VehiculoEntity vehiculo = vehiculoOptional.get();

        if(nuevoVehiculo.getPatente() != null){
            vehiculo.setPatente(nuevoVehiculo.getPatente());
        }
        if(nuevoVehiculo.getMarca() != null){
            vehiculo.setMarca(nuevoVehiculo.getMarca());
        }
        if(nuevoVehiculo.getModelo() != null){
            vehiculo.setModelo(nuevoVehiculo.getModelo());
        }
        if(nuevoVehiculo.getTipo_vehiculo() != null){
            vehiculo.setTipo_vehiculo(nuevoVehiculo.getTipo_vehiculo());
        }
        if(nuevoVehiculo.getAnio_fabricacion() != null){
            vehiculo.setAnio_fabricacion(nuevoVehiculo.getAnio_fabricacion());
        }
        if(nuevoVehiculo.getTipo_motor() != null){
            vehiculo.setTipo_motor(nuevoVehiculo.getTipo_motor());
        }
        if(nuevoVehiculo.getAsientos() != null){
            vehiculo.setAsientos(nuevoVehiculo.getAsientos());
        }
        if(nuevoVehiculo.getKilometraje() != null){
            vehiculo.setKilometraje(nuevoVehiculo.getKilometraje());
        }

        return vehiculoRepository.save(vehiculo);
    }

    public void deleteVehiculo(String patente) {vehiculoRepository.deleteById(patente);}
}
