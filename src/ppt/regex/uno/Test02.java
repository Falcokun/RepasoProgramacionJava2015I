package ppt.regex.uno;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Clases poderosas
Pattern
Matcher
PatternSyntaxException
*/
public class Test02 {
    public static void main(String[] args) {

        String regexp = ".@.";
        String cadena = "DEJense de cos@s y atiend@n!!";

        /**
         * Pattern: es el que va a compilar el regex
         * El matcher, es el match del regex en la cadena String
         * el matcher te dice si se igualo y te permite sacar los grupos extraidos
         */
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(cadena);

        //indica posición de inicio del match. em qué parte de la cadena inicio el match
        //indica posición de fin del match. en qué parte de la cadena debe finalizar el match.
        while (matcher.find()) {
            System.out.println(cadena.substring(matcher.start(), matcher.end()));
            System.out.println("pos Inicio:" + matcher.start());
            System.out.println("pos Fin:" + matcher.end());
        }

        //busca desde donde me quedé hasta encontrar otra parte de la cadena que cumpla la regexp

        //para cambiarle el valor a la cadena, es decir, que se transforme la cadena en otra
        String cadena2 = "P@r@@@@@@ su examen Y@ fueron !!! @@@hhh";
        matcher.reset(cadena2);
        while (matcher.find()) {
            System.out.println(cadena2.substring(matcher.start(), matcher.end()));
            System.out.println("pos Inicio:" + matcher.start());
            System.out.println("pos Fin:" + matcher.end());
        }
    }

}
