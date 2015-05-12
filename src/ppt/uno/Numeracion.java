package ppt.uno;

/**
 * Created by Ricardo on 01/05/2015.
 * Repaso Java
 */
public class Numeracion {
    /**
     * 0: Octal
     * 0x: es hexadecimal
     * 0b: es binario
     */
    public static void main(String[] args) {
        int a = 010;
        int x = 0xaB;
        int b = 0b11;
        String c = "ab";
        System.out.println(a);
        System.out.println(x);
        System.out.println(b);
        System.out.println(c);
        Test02();
        Test03();
        Test04();
        Test05();
        Test06();
        Test07();
    }

    private static void Test07() {
        int i = 0;
        i = Integer.MAX_VALUE;
        System.out.println(i);
    }

    public void $_Hola() {
        System.out.println("Hola!");
    }

    private static void Test06() {
        String g = true ? "a" : "b";

        //String g;
        //if (true)
        int b = 2;
        if (true | b++ < 5) {
            System.out.println(b);
            System.out.println("Hola!");
        }

        int a = 2;

        if (++a < 3) {
            System.out.println("Entro!");
        }

        System.out.println(a);


        int x = 5;
        System.out.println(++x * x++);
        System.out.println("1: " + x++ + " 2: " + x++);


        x = 5;
        if (++x == x--) {
            System.out.println("UY");
            System.out.println(x);
        }

        if (x++ < x++) {
            System.out.println(x);
            System.out.println("HOLA! =D");
        }

        x = 5;

        if (x++ > 2 || --x < 6) {
            System.out.println(":3");
            System.out.println(x);
        }
/*
        String s = null;


        if ((s != null) && s.equals("hola")) {
            System.out.println("es hola :D");
        } else {
            System.out.println("Hubo un error de comuniacciones");
        }
*/

    }

    private int aumentarUno(int a) {
        return ++a;
    }

    private static void Test05() {
        Integer i = 20;
        long a = 4;
        char b = 3;
        Double raro = 9d;
        double c = raro / 0;
        c = c * 0;
        System.out.println("Prueba 5");
        System.out.println(c);


    }

    private static void Test04() {
        int num = 25;
        char x = 'A';
        int suma = num + x;

        byte b1;
        byte b2 = 1;
        byte b3 = 2;
        b1 = (byte) (b2 + b3);
        System.out.println(b1);
        short a = 100;
        short b = 200;
        int c = a + b;
        Integer d = a + b;
    }

    /**
     * Casteo de cosos y autoboxing
     */
    private static void Test03() {
        double d1 = 8.7;
        int i = (int) d1;
        float f = (float) d1;
        double d2 = i;
        double d3 = f;
        System.out.println(d1);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d2);
        System.out.println(d3);
    }

    private static void Test02() {
        byte b;
        for (int i = 0; i < 35; i++) {
            b = (byte) i;
            System.out.println(b);
        }
    }
}
