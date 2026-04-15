package com.MiguelmerinoTema5Maven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class metodoPedraPapelTijeraTest {

    @Test
    void TC01_jugadaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            metodoPedraPapelTijera.jugar("PIEDRA", "FUEGO");
        });
    }

    @Test
    void TC02_empate() {
        assertEquals("EMPATE", metodoPedraPapelTijera.jugar("PIEDRA", "PIEDRA"));
    }

    @Test
    void TC03_ganaJugador1_piedra() {
        assertEquals("JUGADOR1", metodoPedraPapelTijera.jugar("PIEDRA", "TIJERA"));
    }

    @Test
    void TC04_ganaJugador1_tijera() {
        assertEquals("JUGADOR1", metodoPedraPapelTijera.jugar("TIJERA", "PAPEL"));
    }

    @Test
    void TC05_ganaJugador1_papel() {
        assertEquals("JUGADOR1", metodoPedraPapelTijera.jugar("PAPEL", "PIEDRA"));
    }

    @Test
    void TC06_ganaJugador2() {
        assertEquals("JUGADOR2", metodoPedraPapelTijera.jugar("PIEDRA", "PAPEL"));
    }
}