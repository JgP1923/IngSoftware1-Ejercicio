package com.smartdrive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombustionTest {

    private Combustion ford;

    @BeforeEach
    void setUp() {
        ford = new Combustion("Ford", "Mustang", 2021, 260, 60);
    }

    @Test
    void testRepostar() {
        assertDoesNotThrow(() -> ford.Repostar());
    }

    @Test
    void testConducir() {
        assertDoesNotThrow(() -> ford.Conducir());
    }

    @Test
    void testInformacionGeneral() {
        assertDoesNotThrow(() -> ford.InformacionGeneral());
    }
}
