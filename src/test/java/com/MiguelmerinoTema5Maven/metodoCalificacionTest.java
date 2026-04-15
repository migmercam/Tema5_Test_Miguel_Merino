package com.MiguelmerinoTema5Maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    class metodoCalificacionTest {

        @Test
        void TC01_notaInvalidaBaja() {
            assertThrows(IllegalArgumentException.class, () -> {
                metodoCalificacion.calificacion(-1);
            });
        }

        @Test
        void TC02_notaInvalidaAlta() {
            assertThrows(IllegalArgumentException.class, () -> {
                metodoCalificacion.calificacion(11);
            });
        }

        @Test
        void TC03_suspenso() {
            assertEquals("SUSPENSO", metodoCalificacion.calificacion(3));
        }

        @Test
        void TC04_suficiente() {
            assertEquals("SUFICIENTE", metodoCalificacion.calificacion(5));
        }

        @Test
        void TC05_bien() {
            assertEquals("BIEN", metodoCalificacion.calificacion(6));
        }

        @Test
        void TC06_notable() {
            assertEquals("NOTABLE", metodoCalificacion.calificacion(7));
        }

        @Test
        void TC07_sobresaliente() {
            assertEquals("SOBRESALIENTE", metodoCalificacion.calificacion(9));
        }
    }
