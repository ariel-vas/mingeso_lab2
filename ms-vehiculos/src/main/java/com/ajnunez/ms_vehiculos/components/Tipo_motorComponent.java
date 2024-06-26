package com.ajnunez.ms_vehiculos.components;

import com.ajnunez.ms_vehiculos.entities.Tipo_motorEntity;
import com.ajnunez.ms_vehiculos.repositories.Tipo_motorRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Tipo_motorComponent {

    private final Tipo_motorRepository tipo_motorRepository;

    public Tipo_motorComponent(Tipo_motorRepository tipo_motorRepository){
        this.tipo_motorRepository = tipo_motorRepository;
    }

    @PostConstruct
    public void initData() {
        Tipo_motorEntity tipo1 = new Tipo_motorEntity();
        tipo1.setId(1);
        tipo1.setNombre("Gasolina");
        Tipo_motorEntity tipo2 = new Tipo_motorEntity();
        tipo2.setId(2);
        tipo2.setNombre("Diesel");
        Tipo_motorEntity tipo3 = new Tipo_motorEntity();
        tipo3.setId(3);
        tipo3.setNombre("Híbrido");
        Tipo_motorEntity tipo4 = new Tipo_motorEntity();
        tipo4.setId(4);
        tipo4.setNombre("Eléctrico");

        List<Tipo_motorEntity> tiposMotor = Arrays.asList(tipo1, tipo2, tipo3, tipo4);
        tipo_motorRepository.saveAll(tiposMotor);
    }
}
