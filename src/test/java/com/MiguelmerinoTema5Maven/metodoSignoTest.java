package com.MiguelmerinoTema5Maven;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class metodoSignoTest {

    @Test
    void TC01_numeroPositivo() {
        assertEquals(1, metodoSigno.signo(5));
    }

    @Test
    void TC02_numeroNegativo() {
        assertEquals(-1, metodoSigno.signo(-3));
    }

    @Test
    void TC03_valorCero() {
        assertEquals(0, metodoSigno.signo(0));
    }
}