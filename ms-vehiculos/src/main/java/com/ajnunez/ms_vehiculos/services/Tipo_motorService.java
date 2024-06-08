package com.ajnunez.ms_vehiculos.services;

import com.ajnunez.ms_vehiculos.entities.Tipo_motorEntity;
import com.ajnunez.ms_vehiculos.models.CrearTipo;
import com.ajnunez.ms_vehiculos.repositories.Tipo_motorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Tipo_motorService {

    Tipo_motorRepository tipo_motorRepository;

    @Autowired
    public Tipo_motorService(Tipo_motorRepository tipo_motorRepository) {
        this.tipo_motorRepository = tipo_motorRepository;
    }

    public List<Tipo_motorEntity> getTipo_motores() { return tipo_motorRepository.findAll(); }

    public Optional<Tipo_motorEntity> getTipo_motor(Integer id) {
        return tipo_motorRepository.findById(id);
    }

    @Transactional
    public Tipo_motorEntity saveTipo_motor(CrearTipo body)
    {
        Tipo_motorEntity nuevoTipo = new Tipo_motorEntity();
        nuevoTipo.setId(body.getId());
        nuevoTipo.setNombre(body.getNombre());

        return tipo_motorRepository.save(nuevoTipo);
    }

    public void deleteTipo_motor(Integer id) {tipo_motorRepository.deleteById(id);}
}
