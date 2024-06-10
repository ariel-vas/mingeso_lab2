package com.ajnunez.ms_reparaciones.services;

import com.ajnunez.ms_reparaciones.entities.ReparacionEntity;
import com.ajnunez.ms_reparaciones.repositories.ReparacionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReparacionService {

    ReparacionRepository reparacionRepository;

    @Autowired
    public ReparacionService(ReparacionRepository reparacionRepository) {this.reparacionRepository = reparacionRepository;}

    public List<ReparacionEntity> getReparaciones() {return reparacionRepository.findAll();}

    public Optional<ReparacionEntity> getReparacionById(Integer id) {return reparacionRepository.findById(id); }

    public ReparacionEntity updateReparacion(Integer id, ReparacionEntity nuevaReparacion)
    {
        Optional<ReparacionEntity> reparacionOptional = reparacionRepository.findById(id);

        if(reparacionOptional.isEmpty()){
            throw new RuntimeException("La reparación" + id + "no existe en el registro.");
        }

        ReparacionEntity reparacion = reparacionOptional.get();

        if(nuevaReparacion.getNombre() != null){
            reparacion.setNombre(nuevaReparacion.getNombre());
        }
        if(nuevaReparacion.getGasolina() != null){
            reparacion.setGasolina(nuevaReparacion.getGasolina());
        }
        if(nuevaReparacion.getDiesel() != null){
            reparacion.setDiesel(nuevaReparacion.getDiesel());
        }
        if(nuevaReparacion.getHibrido() != null){
            reparacion.setHibrido(nuevaReparacion.getHibrido());
        }
        if(nuevaReparacion.getElectrico() != null){
            reparacion.setElectrico(nuevaReparacion.getElectrico());
        }

        return reparacionRepository.save(reparacion);
    }

    public void deleteReparacion(Integer id) {reparacionRepository.deleteById(id);}
}
