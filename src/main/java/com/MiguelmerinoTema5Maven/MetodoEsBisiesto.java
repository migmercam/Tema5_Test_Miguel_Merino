package com.MiguelmerinoTema5Maven;

public class MetodoEsBisiesto {




    public static boolean esBisiesto(int anyo) {
            if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
                return true;
            }else {
            return false;}
        }

}
