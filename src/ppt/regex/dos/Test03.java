/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt.regex.dos;

import java.util.Scanner;

/**
 * Exceptions y Assertions
 */
public class Test03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un entero entre 0 y 5:");

        int n = sc.nextInt();

        assert (n >= 0 && n <= 5) : "Ingreso inválido" + n;
        System.out.println("\nEl valor ingresado es " + n);
    }

}
