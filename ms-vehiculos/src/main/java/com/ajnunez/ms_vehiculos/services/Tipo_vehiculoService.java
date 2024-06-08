package com.ajnunez.ms_vehiculos.services;

import com.ajnunez.ms_vehiculos.entities.Tipo_vehiculoEntity;
import com.ajnunez.ms_vehiculos.models.CrearTipo;
import com.ajnunez.ms_vehiculos.repositories.Tipo_vehiculoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Tipo_vehiculoService {

    Tipo_vehiculoRepository tipo_vehiculoRepository;

    @Autowired
    public Tipo_vehiculoService(Tipo_vehiculoRepository tipo_vehiculoRepository) {
        this.tipo_vehiculoRepository = tipo_vehiculoRepository;
    }

    public List<Tipo_vehiculoEntity> getTipo_vehiculos() { return tipo_vehiculoRepository.findAll(); }

    public Optional<Tipo_vehiculoEntity> getTipo_vehiculo(Integer id) {
        return tipo_vehiculoRepository.findById(id);
    }

    @Transactional
    public Tipo_vehiculoEntity saveTipo_vehiculo(CrearTipo body)
    {
        Tipo_vehiculoEntity nuevoTipo = new Tipo_vehiculoEntity();
        nuevoTipo.setId(body.getId());
        nuevoTipo.setNombre(body.getNombre());

        return tipo_vehiculoRepository.save(nuevoTipo);
    }

    public void deleteTipo_vehiculo(Integer id) {tipo_vehiculoRepository.deleteById(id);}
}
