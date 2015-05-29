package ppt.regex.uno;

/*
Regular Expressions
*/
public class Test01 {
    static String regexp = ".@.";

    String cadena = "g@k";

    public static void main(String[] args) {

        ejemplo("g@k");
        ejemplo("abc@gmail.com");
        ejemplo("20120009@ulima.edu.pe");
        ejemplo("$@=");

        ejemplo2("$@=");
        ejemplo2("123456@abc.com");
        ejemplo3();
    }

    public static void ejemplo(String s) {
        System.out.println(s.matches(regexp) ? "True" : "False");
    }

    public static void ejemplo2(String s) {
        //Busca todos los patrones, según la regular expresión, y reemplázalos por esa cadena que mandé, osea por "XYZ".
        s = s.replaceAll(regexp, "XYZ");
        System.out.println(s);
    }

    public static void ejemplo3() {
        //cuando ^ va adelante, fuera de los corchetes significa complemento. Solo se acepta lo que está adentro.
        //cuando se va al medio o al final, es un caracter más
        String regexp1 = "[^AB]";
        String regexp2 = "[A^B]";

        String cad = "A";

        if (cad.matches(regexp1)) {
            System.out.println("ejemplo 3 true");
        }
    }

}
