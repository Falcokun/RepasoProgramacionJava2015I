/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt.stringbuilder;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        /**
         * Clasica forma de registar unn string
         */
        String s1 = "DABALE ARROZ A LA ZORRA EL ABAD";
        Scanner sc = new Scanner(System.in);
        s1 = s1.replaceAll(" ", "");
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        System.out.println(s1);
        System.out.println(sb.toString());

        if (s1 == sb.toString()) {
            System.out.println("Es verdad");
        } else {
            System.out.println("No es esa cosa");
        }

        String s2 = new String("HOLA"); //creada una referencia en memoria
        String s3 = "HOLA"; //creado en el pull de constantes
        String s4 = "HOLA";

        //Strings son INMUTABLES: no puedo cambiar el valor sin cambiar la referencia (como si fuese una variable).

        //Clases extras
        //Son también arreglos de char, pero tienen la particularidad de redefinen el tamaño de los arreglos internos (como si fuesen una Lista)
        StringBuilder sb1; //No sincronizado (problemas trae si se trabaja en concurrencia)
        StringBuffer sb2 = new StringBuffer(); //Sincronizado (soporta y permite manejar concurrencia)
        //Por defalut, en un StringBuffer se crea un arreglo de longitud 16 y capacity 32 (capacity = 2*length)

        System.out.println("LENGTH: " + sb2.length());
        System.out.println("CAPACITY: " + sb2.capacity());

        sb2.append("HOLA A TODOS; PIÑA PARA EL EXAMEN");
        //Cuando le agrego ese texto con append(), me amplía la capacidad del arreglo el doble del default (32) + 2.
        //Por ello sale 34 de capacity
        System.out.println("LENGTH: " + sb2.length());
        System.out.println("CAPACITY: " + sb2.capacity());


    }

}
