package com.MiguelmerinoTema5Maven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class metodoClasificarEdadTest {
    @Test
    void TC01_edadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            metodoClasificarEdad.clasificarEdad(-1);
        });
    }

    @Test
    void TC02_infanciaInferior() {
        assertEquals("Infancia", metodoClasificarEdad.clasificarEdad(0));
    }

    @Test
    void TC03_infanciaSuperior() {
        assertEquals("Infancia", metodoClasificarEdad.clasificarEdad(5));
    }

    @Test
    void TC04_ninezInicio() {
        assertEquals("Niñez", metodoClasificarEdad.clasificarEdad(6));
    }

    @Test
    void TC05_adolescenciaInicio() {
        assertEquals("Adolescencia", metodoClasificarEdad.clasificarEdad(12));
    }

    @Test
    void TC06_juventudInicio() {
        assertEquals("Juventud", metodoClasificarEdad.clasificarEdad(18));
    }

    @Test
    void TC07_adultezInicio() {
        assertEquals("Adultez", metodoClasificarEdad.clasificarEdad(25));
    }

    @Test
    void TC08_vejez() {
        assertEquals("Vejez", metodoClasificarEdad.clasificarEdad(60));
    }
    }

