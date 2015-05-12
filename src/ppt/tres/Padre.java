package ppt.tres;

/**
 * Created by Ricardo on 08/05/2015.
 * Repaso
 */
public class Padre {
    {
        System.out.println("Iniciador instance padres");
    }

    static {
        System.out.println("Iniciador static padre");
    }


    public static void main(String[] args) {
        System.out.println("PSVM Padre (es estatico)");

        new Hijo().metodo();
        System.out.println("---------------------------------");
    }

    public Padre() {
        System.out.println("Constructor de Padre ");
    }

    public void metodo() {
        System.out.println("Metodo de Padres");
    }
}
