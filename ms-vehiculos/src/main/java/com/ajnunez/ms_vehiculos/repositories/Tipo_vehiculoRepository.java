package com.ajnunez.ms_vehiculos.repositories;

import com.ajnunez.ms_vehiculos.entities.Tipo_vehiculoEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface Tipo_vehiculoRepository extends JpaRepository<Tipo_vehiculoEntity, Integer> {
}
