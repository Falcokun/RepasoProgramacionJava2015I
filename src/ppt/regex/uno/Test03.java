package ppt.regex.uno;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03 {

    public static void main(String[] args) {
        //se pone doble \\ para que considere
        //[\\d] means: cualquier cantidad de dígitos
        
        //Este pattern es uno o más dígitos
        String regexp = "[\\d]+";//si le quito los corchetes, implica solo un dígito.
        
        //Este pattern es 2 o más dígitos JUNTOS que se repitan
        String regexp2 = "[\\d\\d]+";
        String regexp3 = "([a-z][0-9])+"; //Este patrón no es igual a ( [a-z][0-9] )+ y a ([a-z][0-9] )+
        String cadena = "D3J3n4s3 d3 c0s@s y @t13nd@n";
        Pattern pattern = Pattern.compile(regexp3);
        Matcher matcher = pattern.matcher(cadena);
        
        
        while (matcher.find()){
            System.out.println(cadena.substring(matcher.start(), matcher.end()));
            System.out.println("pos Inicio:" + matcher.start());
            System.out.println("pos Fin:" + matcher.end());    
        }
    }
    
}
