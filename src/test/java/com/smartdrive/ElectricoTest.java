package com.smartdrive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElectricoTest {

    private Electrico tesla;

    @BeforeEach
    void setUp() {
        tesla = new Electrico("Tesla", "Model S", 2024, 250, 100);
    }

    @Test
    void testCargarBateria() {
        // No devuelve valor, pero podemos verificar que no lance excepción
        assertDoesNotThrow(() -> tesla.CargarBateria());
    }

    @Test
    void testConducir() {
        assertDoesNotThrow(() -> tesla.Conducir());
    }

    @Test
    void testPilotoAutomatico() {
        assertDoesNotThrow(() -> tesla.ActivarPilotoAutomatico());
    }

    @Test
    void testAsistenciaEmergencias() {
        assertDoesNotThrow(() -> tesla.ActivarAsistenciaEmergencias());
    }

    @Test
    void testInformacionGeneral() {
        assertDoesNotThrow(() -> tesla.InformacionGeneral());
    }
}
