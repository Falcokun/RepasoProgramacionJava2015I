/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt.stringbuilder;

/**
 *
 * @author Administrator
 */
public class Test02 {
    
    String[] cadenas = new String[10]; //== size
    int pos= 0; //== capacity
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Test02 t = new Test02();
        t.logica();
    }
    
    public void logica(){
        for (int i = 0; i <20; i++){
            agregarRef(i + " - " + i*10);
        }
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
    }
    
    private void agregarRef(String s){
        if (pos < cadenas.length){
            cadenas[pos] = s;
            pos++;
        }
    }
    
}
