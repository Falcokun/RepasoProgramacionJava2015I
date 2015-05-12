package ppt.dos;

import java.io.Serializable;

/**
 * Created by Ricardo on 01/05/2015.
 * Repaso
 */
public class Instance {
    public static void main(String[] args) {
        String s= "Hola Mundo";
        if (s instanceof String){
            System.out.println("Es String");
        }
        if (s instanceof Object){
            System.out.println("Es Object");
        }
        if (s instanceof Serializable){
            System.out.println("Es Serializable");
        }
    }
}
