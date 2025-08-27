public class Bucles {
    public static void main(String[] args) {

        //Bucles FOR
        //Mostrar los números del 1 al 10

        System.out.println("FOR: numeros del 1 al 10");

        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }

        //Bucle while
        System.out.println("---------------------------------");
        System.out.println("WHILE: suma acumulada");
        int i = 0;
        int suma = 0;

        while (i<5){
            suma += i;
            i++;
        }
        System.out.println("La suma acumulada es: " + suma);
    }
}
