package com.ajnunez.ms_reparaciones.repositories;

import com.ajnunez.ms_reparaciones.entities.ReparacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReparacionRepository extends JpaRepository<ReparacionEntity, Integer> {
}
