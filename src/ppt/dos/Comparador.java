package ppt.dos;

/**
 * Created by Ricardo on 01/05/2015.
 * Repaso
 */
public class Comparador {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        if (a = b) {
            System.out.println("entro a");
        }

        if (b = false) {
            System.out.println("entro b");
        }


        System.out.println(a);
        System.out.println(b);

        int i = 3;

        if (i++ < i + (i = -1)) {
            System.out.println(i);
        }else{
            System.out.println("no entro");
            System.out.println(i);
        }


    }

}
