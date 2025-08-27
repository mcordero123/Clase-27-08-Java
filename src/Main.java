public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        int c = 1;

        int suma = a+b;
        int resta = a-b;
        int mult = a*b;
        double division = (double) a /b;
        int modulo = a%b;
        int incremento = ++a;
        int decremento = --b;

        System.out.println("SUMA: " + suma);
        System.out.println("RESTA: " + resta);
        System.out.println("Multiplicación: " + mult);
        System.out.println("DIVISION: " + division);
        System.out.println("MODULO: " + modulo);
        System.out.println("INCREMENTO DE A: " + incremento);
        System.out.println("DECREMENTO DE B: " + decremento);

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b && c<b);
        System.out.println(a>b && c<b);
        System.out.println(a>b || c<b);
    }
}