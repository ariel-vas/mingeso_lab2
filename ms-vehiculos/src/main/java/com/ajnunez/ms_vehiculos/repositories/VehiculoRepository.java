package com.ajnunez.ms_vehiculos.repositories;

import com.ajnunez.ms_vehiculos.entities.VehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<VehiculoEntity, String> {
}
