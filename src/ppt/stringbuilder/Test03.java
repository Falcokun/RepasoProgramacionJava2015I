/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt.stringbuilder;

public class Test03 {

    public static void main(String[] args) {
        String abcdario = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        long ini = 0;
        long fin = 0;

        String s1 = "";
        ini = System.currentTimeMillis();

        for (int k = 0; k < 100; k++)
            for (int i = 0; i < abcdario.length(); i++) {
                s1 += abcdario.substring(i, i + 1);
            }
        fin = System.currentTimeMillis();

        System.out.println((fin - ini) + " " + "s1");

        StringBuffer s2 = new StringBuffer();

        //puedo redefinir la longitud del StringBuffer así, usando setLength()
        s2.setLength(10000);

        ini = System.currentTimeMillis();
        for (int k = 0; k < 100; k++)
            for (int i = 0; i < abcdario.length(); i++) {
                s2.append(abcdario.substring(i, i + 1));
            }
        fin = System.currentTimeMillis();

        System.out.println((fin - ini) + " " + "s2");

        StringBuffer s3 = new StringBuffer();
        ini = System.currentTimeMillis();
        for (int k = 0; k < 100; k++)
            for (int i = 0; i < abcdario.length(); i++) {
                s3.append(abcdario.substring(i, i + 1));
            }
        fin = System.currentTimeMillis();

        System.out.println((fin - ini) + " " + "s3");
    }

}
