/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt.regex.dos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class Test02 {

    String regexp1 = "^(?<user>[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*)";
    String regexp2 ="@";
    String regexp3="(?<domain>[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*(\\.[_A-Za-z0-9-]{2,}))$";
    Pattern pattern;
    Matcher matcher;
    
    public static void main(String[] args) {
        Test02 t = new Test02();
        t.logica();
    }
    
    private void logica(){
        pattern = Pattern.compile(regexp1+regexp2+regexp3);
        //Se puede contener varios regexp así (si es que están separados, claro):
        //
        System.out.println(validaEmail("abc_@ulima.edu"));
        System.out.println(validaEmail("abc_@ulima.edu.pe"));
        System.out.println(validaEmail("+@bc_.y@.fueron@examen.java.je.je"));
    }
    
    private boolean validaEmail(String email){
        matcher = pattern.matcher(email);
        
        if (matcher.find()){
            System.out.println("EMAIL: " + email);
            System.out.println("El user: " + matcher.group("user"));
            System.out.println("El domain: " + matcher.group("domain"));
        }
        
        return matcher.find();
    }
    
}
