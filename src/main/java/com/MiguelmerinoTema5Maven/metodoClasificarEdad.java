package com.MiguelmerinoTema5Maven;

import java.util.Scanner;

public class metodoClasificarEdad {

    public static void main(String[]args){
        int edad;
        Scanner lector=new Scanner(System.in);
        System.out.println("Probando el metodo clasificarEdad \n"+"Introduce la edad a consultar");
        edad=lector.nextInt();
        System.out.println("Depende de la edad que hayamos puesto aparecera un resultado o otro \n"+"Si la edad es menor a 6 aparecera un 'Infancia' \n"+
                "Si la edad  es <12 aparecera un 'niñez' \n"+"Si la edad es <18 aparecera 'Adolescencia'\n"+"Si la edad es <25 aparecera 'Juventud'\n"+
                "Si la edad es <60 aparecera 'Adultez'\n"+"Si la edad es mayor o igual a 60 aparecera 'Vejez' "+"La edad era: "+edad+"\n Entonces el metodo respondera con un: "+clasificarEdad(edad));
    }
    public static String clasificarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad no válida");
        } if (edad < 6) {
            return "Infancia";
        } else if (edad < 12) {
            return "Niñez";
        } else if (edad < 18) { return "Adolescencia";
        } else if (edad < 25) {
            return "Juventud";
        } else if (edad < 60) {
            return "Adultez";
        } else {
            return "Vejez";
        }
    }

}
