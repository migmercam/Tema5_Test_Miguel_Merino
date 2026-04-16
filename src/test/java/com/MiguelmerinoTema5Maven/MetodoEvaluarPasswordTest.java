package com.MiguelmerinoTema5Maven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordTest {

    @Test
    void TC01_muyDebil() {
        assertEquals(1, MetodoEvaluarPassword.evaluarPassword("abc"));
    }

    @Test
    void TC02_soloMinusculas() {
        assertEquals(2, MetodoEvaluarPassword.evaluarPassword("abcdefgh"));
    }

    @Test
    void TC03_minusculasYNumeros() {
        assertEquals(3, MetodoEvaluarPassword.evaluarPassword("abc12345"));
    }

    @Test
    void TC04_conMayuscula() {
        assertEquals(4, MetodoEvaluarPassword.evaluarPassword("Abc12345"));
    }

    @Test
    void TC05_fuerte() {
        assertEquals(5, MetodoEvaluarPassword.evaluarPassword("Abc123$%"));
    }

    @Test
    void TC06_soloNumeros() {
        assertEquals(2, MetodoEvaluarPassword.evaluarPassword("12345678"));
    }
}