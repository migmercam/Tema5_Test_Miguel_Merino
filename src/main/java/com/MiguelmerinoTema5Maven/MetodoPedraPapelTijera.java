package com.MiguelmerinoTema5Maven;

public class MetodoPedraPapelTijera {

    public static String jugar(String jugador1, String jugador2) {

        // Validación de si es piedra papel o tijera
        if (!esValida(jugador1) || !esValida(jugador2)) {
            throw new IllegalArgumentException("Jugada no válida");
        }

        // Empate
        if (jugador1.equals(jugador2)) {
            return "EMPATE";
        }

        // Casos donde gana jugador1
        if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) ||
                (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) ||
                (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))) {
            return "JUGADOR1";
        }

        // Si no, gana jugador2
        return "JUGADOR2";
    }
//C on este metodo hacemos que solo se marquen como validas las opciones de piedra papel o tijera, para no poner platano y k funcione
    private static boolean esValida(String jugada) {
        return jugada.equals("PIEDRA") ||
                jugada.equals("PAPEL") ||
                jugada.equals("TIJERA");
    }
}

