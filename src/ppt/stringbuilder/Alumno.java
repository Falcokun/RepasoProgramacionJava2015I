/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt.stringbuilder;

/**
 *
 * @author Administrator
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private int nota;

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("Alumno{")
                .append("nombre=")
                .append(nombre)
                .append(", apellido=")
                .append(apellido)
                .append(", nota=")
                .append(nota)
                .append("}");
        return s.toString();
    }
    
    
}
