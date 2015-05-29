/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt.stringbuilder;

public class Test04 {

    public static void main(String[] args) {
        String s = "LOS POLLITOS DICEN PIO PIO";
        String r = "01234567890123456789012345";

        System.out.println(s.lastIndexOf("PIO"));
        System.out.println(s.lastIndexOf("PIO", 18)); //si no lo encuentra, devuelve -1

        //Reemplazar en String
        s = s.replace('O', 'X');
        System.out.println(s);

        //esto es una sustitución
        //StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.replace(0, s.length(), "X");
        System.out.println(sb);

        //Inserta en un String
        //Insertar String en un String
        s = s.substring(0, 10) + "------" + s.substring(10);
        //extrayendo las primeras 9 posiciones, agrego guiones y coloco lo que queda de la cadena
        System.out.println(s);
        //StringBuffer
        StringBuffer sb2 = new StringBuffer(r);
        sb2.insert(11, "****");
        System.out.println(sb2);

        //Para eliminar caracteres de la cadena de texto
        sb2.delete(9, 12);
        System.out.println(sb2);
    }

}
