public class Condiciones {
    public static void main(String[] args) {
        //determinar si el numero es par o impar

        int num = 7;

        if (num % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

        //operador Ternario

        String resultado = num % 2 == 0 ? "El número es par": "El número es impar";
        System.out.println(resultado);
    }
}
