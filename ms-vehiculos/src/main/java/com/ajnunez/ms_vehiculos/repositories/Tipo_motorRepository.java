package com.ajnunez.ms_vehiculos.repositories;

import com.ajnunez.ms_vehiculos.entities.Tipo_motorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_motorRepository extends JpaRepository<Tipo_motorEntity, Integer> {
}
