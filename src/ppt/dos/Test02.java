package ppt.dos;

/**
 * Created by Ricardo on 01/05/2015.
 * Repaso
 */
public class Test02 {
    public static void main(String[] args) {
        short i=5;

        go(5);
    }

    private static void go(Integer x) {
        System.out.println("En Integer");
    }
    private static void go(long x){
        System.out.println("En Long");
    }
    private static void go(int x){
        System.out.println("En int");
    }
}
