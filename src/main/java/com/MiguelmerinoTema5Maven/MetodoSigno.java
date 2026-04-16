package com.MiguelmerinoTema5Maven;
import java.util.Scanner;

public class MetodoSigno {
public static void main(String[]args){
    int prueba;
    Scanner lector=new Scanner(System.in);
    System.out.println("Probando el metodo signo \n"+"Introduce un numero entero");
    prueba=lector.nextInt();
    System.out.println("Depende del numero entero aparecera un resultado o otro \n"+"Si el número es entero positivo aparecera 1\n"+
            "Si el número es negativo aparecera un -1 \n"+"y si el numero es 0 aparecera 0\n"+"Tu número era: "+prueba+"\n Entonces el metodo respondera con un: "+signo(prueba));
}
    public static int signo(int x) {
    if (x > 0) {
        return 1;
    } else if (x < 0) {
        return -1;
    }
    return 0;
}
}
