
package com.MiguelmerinoTema5Maven;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    class metodoEsBisiestoTest {

        @Test
        void TC01_divisiblePor4NoPor100() {
            assertTrue(metodoEsBisiesto.esBisiesto(2024));
        }

        @Test
        void TC02_divisiblePor100NoPor400() {
            assertFalse(metodoEsBisiesto.esBisiesto(1900));
        }

        @Test
        void TC03_divisiblePor400() {
            assertTrue(metodoEsBisiesto.esBisiesto(2000));
        }

        @Test
        void TC04_noDivisiblePor4() {
            assertFalse(metodoEsBisiesto.esBisiesto(2023));
        }
    }
