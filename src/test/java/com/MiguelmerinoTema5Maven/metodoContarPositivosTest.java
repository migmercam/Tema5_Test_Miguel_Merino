package com.MiguelmerinoTema5Maven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContarPositivosTest {

    @Test
    void TC01_arrayVacio() {
        int[] datos = {};
        assertEquals(0, MetodoContarPositivos.contarPositivos(datos));
    }

    @Test
    void TC02_todosNegativos() {
        int[] datos = {-1, -2, -3};
        assertEquals(0, MetodoContarPositivos.contarPositivos(datos));
    }

    @Test
    void TC03_mezclaValores() {
        int[] datos = {1, -2, 0, 3};
        assertEquals(2, MetodoContarPositivos.contarPositivos(datos));
    }
}