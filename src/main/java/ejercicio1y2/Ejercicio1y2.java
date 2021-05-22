package ejercicio1y2;
import java.util.Scanner;

public class Ejercicio1y2 {
    private int n1, n2;

    public void ordenarNumero(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("los dos numeros son iguales");
        } else if (n1 > n2) {
            System.out.println("este es el numero mayor " + n1);
        } else {
            System.out.println("este es el numero mayor " + n2);
        }
    }

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio1y2 miEjercicio1 =new Ejercicio1y2();

        System.out.println("ingresa el primer numero");
        int n1 = Integer.parseInt(entradaScanner.nextLine());
        System.out.println("ingresa el segundo numero");
        int n2 = Integer.parseInt(entradaScanner.nextLine());

        miEjercicio1.ordenarNumero(n1, n2);

    }




}
