package ppt.dos;

/**
 * Created by Ricardo on 01/05/2015.
 * Repaso
 */
public class Equals {
    public static void main(String[] args) {

        String i1 = new String("Hola");
        String i2 = new String("Hola");
        System.out.println(i1.getClass() + "" + i1.hashCode());
        System.out.println(i2.getClass() + "" + i2.hashCode());
        //i1=i2;
        System.out.println(i1.getClass() + "" + i1.hashCode());
        System.out.println(i2.getClass() + "" + i2.hashCode());

        if (i1 == i2) {
            System.out.println("son el mismo objeto");
        }
        if (i1.equals(i2)) {
            System.out.println("tienen el mimso valor");
        }
      /*
        Hola a1 = new Hola();
        Hola a2 = new Hola();
        a1.a = 3;
        a2.a = 3;
        if (a1 == a2) {
            System.out.println("son el mismo objeto");
        }
        if (a1.equals(a2)) {
            System.out.println("tienen el mimso valor");
        }
  */
    }

    private static class Hola {
        int a;

        private int metodo() {
            System.out.println(toString());
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return this.a == ((Hola) obj).a;
        }
    }
}
