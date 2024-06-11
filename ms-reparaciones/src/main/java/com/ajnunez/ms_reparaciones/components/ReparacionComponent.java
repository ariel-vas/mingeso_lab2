package com.ajnunez.ms_reparaciones.components;

import com.ajnunez.ms_reparaciones.entities.ReparacionEntity;
import com.ajnunez.ms_reparaciones.repositories.ReparacionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ReparacionComponent {
    private final ReparacionRepository reparacionRepository;

    public ReparacionComponent(ReparacionRepository reparacionRepository) {
        this.reparacionRepository = reparacionRepository;
    }

    @PostConstruct
    public void initData() {
        ReparacionEntity r1 = new ReparacionEntity();
        r1.setId(1);
        r1.setNombre("Sistema de Frenos");
        r1.setGasolina(120000);
        r1.setDiesel(120000);
        r1.setHibrido(180000);
        r1.setElectrico(220000);
        ReparacionEntity r2 = new ReparacionEntity();
        r2.setId(2);
        r2.setNombre("Sistema de Refrigeración");
        r2.setGasolina(130000);
        r2.setDiesel(130000);
        r2.setHibrido(190000);
        r2.setElectrico(230000);
        ReparacionEntity r3 = new ReparacionEntity();
        r3.setId(3);
        r3.setNombre("Motor");
        r3.setGasolina(350000);
        r3.setDiesel(450000);
        r3.setHibrido(700000);
        r3.setElectrico(800000);
        ReparacionEntity r4 = new ReparacionEntity();
        r4.setId(4);
        r4.setNombre("Transmisión");
        r4.setGasolina(210000);
        r4.setDiesel(210000);
        r4.setHibrido(300000);
        r4.setElectrico(300000);
        ReparacionEntity r5 = new ReparacionEntity();
        r5.setId(5);
        r5.setNombre("Sistema Eléctrico");
        r5.setGasolina(150000);
        r5.setDiesel(150000);
        r5.setHibrido(200000);
        r5.setElectrico(250000);
        ReparacionEntity r6 = new ReparacionEntity();
        r6.setId(6);
        r6.setNombre("Sistema de Escape");
        r6.setGasolina(100000);
        r6.setDiesel(120000);
        r6.setHibrido(450000);
        r6.setElectrico(0);
        ReparacionEntity r7 = new ReparacionEntity();
        r7.setId(7);
        r7.setNombre("Neumáticos y Ruedas");
        r7.setGasolina(100000);
        r7.setDiesel(100000);
        r7.setHibrido(100000);
        r7.setElectrico(100000);
        ReparacionEntity r8 = new ReparacionEntity();
        r8.setId(8);
        r8.setNombre("Suspensión y la Dirección");
        r8.setGasolina(180000);
        r8.setDiesel(180000);
        r8.setHibrido(210000);
        r8.setElectrico(250000);
        ReparacionEntity r9 = new ReparacionEntity();
        r9.setId(9);
        r9.setNombre("Sistema de Aire Acondicionado y Calefacción");
        r9.setGasolina(150000);
        r9.setDiesel(150000);
        r9.setHibrido(180000);
        r9.setElectrico(180000);
        ReparacionEntity r10 = new ReparacionEntity();
        r10.setId(10);
        r10.setNombre("Sistema de Combustible");
        r10.setGasolina(130000);
        r10.setDiesel(140000);
        r10.setHibrido(220000);
        r10.setElectrico(0);
        ReparacionEntity r11 = new ReparacionEntity();
        r11.setId(11);
        r11.setNombre("Parabrisas y Cristales");
        r11.setGasolina(80000);
        r11.setDiesel(80000);
        r11.setHibrido(80000);
        r11.setElectrico(80000);

        List<ReparacionEntity> reparaciones = Arrays.asList(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        reparacionRepository.saveAll(reparaciones);
    }
}
