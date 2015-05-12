package ppt.tres;

/**
 * Created by Ricardo on 08/05/2015.
 * Repaso
 */
public class Hijo extends Padre {
    {
        System.out.println("Iniciador instance hijo");
    }

    static {
        System.out.println("Iniciador static hijo");
    }


    public static void main(String[] args) {
        System.out.println("PSVM Hijo (es estatico)");

        new Hijo().metodo();
        System.out.println("---------------------------------");
    }

    public static void main(int args) {
        System.out.println("PSVM Hijo (es estatico)");

        new Hijo().metodo();
    }

    public Hijo() {
        System.out.println("Constructor de Hijo ");
    }

    public void metodo() {
        System.out.println("Metodo de Hijo");
    }
}
