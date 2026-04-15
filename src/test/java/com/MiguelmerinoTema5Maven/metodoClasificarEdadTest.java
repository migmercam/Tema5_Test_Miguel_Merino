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
    void TC02_infancia() {
        assertEquals("Infancia", metodoClasificarEdad.clasificarEdad(5));
    }

    @Test
    void TC03_ninez() {
        assertEquals("Niñez", metodoClasificarEdad.clasificarEdad(6));
    }

    @Test
    void TC04_adolescencia() {
        assertEquals("Adolescencia", metodoClasificarEdad.clasificarEdad(12));
    }

    @Test
    void TC05_juventud() {
        assertEquals("Juventud", metodoClasificarEdad.clasificarEdad(18));
    }

    @Test
    void TC06_adultez() {
        assertEquals("Adultez", metodoClasificarEdad.clasificarEdad(25));
    }

    @Test
    void TC07_vejez() {
        assertEquals("Vejez", metodoClasificarEdad.clasificarEdad(60));
    }
    }

