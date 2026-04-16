package com.MiguelmerinoTema5Maven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MetodoClasificarEdadTest {
    @Test
    void TC01_edadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            MetodoClasificarEdad.clasificarEdad(-1);
        });
    }

    @Test
    void TC02_infancia() {
        assertEquals("Infancia", MetodoClasificarEdad.clasificarEdad(5));
    }

    @Test
    void TC03_ninez() {
        assertEquals("Niñez", MetodoClasificarEdad.clasificarEdad(6));
    }

    @Test
    void TC04_adolescencia() {
        assertEquals("Adolescencia", MetodoClasificarEdad.clasificarEdad(12));
    }

    @Test
    void TC05_juventud() {
        assertEquals("Juventud", MetodoClasificarEdad.clasificarEdad(18));
    }

    @Test
    void TC06_adultez() {
        assertEquals("Adultez", MetodoClasificarEdad.clasificarEdad(25));
    }

    @Test
    void TC07_vejez() {
        assertEquals("Vejez", MetodoClasificarEdad.clasificarEdad(60));
    }
    }

