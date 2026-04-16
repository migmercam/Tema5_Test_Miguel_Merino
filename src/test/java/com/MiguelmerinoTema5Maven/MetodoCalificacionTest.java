package com.MiguelmerinoTema5Maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    class MetodoCalificacionTest {

        @Test
        void TC01_notaInvalidaBaja() {
            assertThrows(IllegalArgumentException.class, () -> {
                MetodoCalificacion.calificacion(-1);
            });
        }

        @Test
        void TC02_notaInvalidaAlta() {
            assertThrows(IllegalArgumentException.class, () -> {
                MetodoCalificacion.calificacion(11);
            });
        }

        @Test
        void TC03_suspenso() {
            assertEquals("SUSPENSO", MetodoCalificacion.calificacion(3));
        }

        @Test
        void TC04_suficiente() {
            assertEquals("SUFICIENTE", MetodoCalificacion.calificacion(5));
        }

        @Test
        void TC05_bien() {
            assertEquals("BIEN", MetodoCalificacion.calificacion(6));
        }

        @Test
        void TC06_notable() {
            assertEquals("NOTABLE", MetodoCalificacion.calificacion(7));
        }

        @Test
        void TC07_sobresaliente() {
            assertEquals("SOBRESALIENTE", MetodoCalificacion.calificacion(9));
        }
    }
