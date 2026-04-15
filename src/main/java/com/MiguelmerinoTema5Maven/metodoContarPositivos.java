package com.MiguelmerinoTema5Maven;

import java.util.Scanner;

public class metodoContarPositivos {
    public static void main(String[]args){
        int[] prueba;
        Scanner lector=new Scanner(System.in);
        System.out.println("Probando el metodo contarPositivos \n"+"Introduce un numero entero");
        prueba=lector.nextInt();
        System.out.println("Depende del numero entero aparecera un resultado o otro \n"+"Si el número es entero positivo aparecera 1\n"+
                "Si el número es negativo aparecera un -1 \n"+"y si el numero es 0 aparecera 0\n"+"Tu número era: "+prueba+"\n Entonces el metodo respondera con un: "+contarPositivos(prueba));
    }
    public static int contarPositivos(int[] datos) {
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

}
