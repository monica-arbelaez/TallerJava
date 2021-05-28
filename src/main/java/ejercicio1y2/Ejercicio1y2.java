package ejercicio1y2;

import java.util.Scanner;

public class Ejercicio1y2 {
    private int n1, n2;

    public void ordenarNumero(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("los dos numeros son iguales");
        } else if (n1 > n2) {
            System.out.println(n1 + " este es el numero mayor ");
        } else {
            System.out.println(n2 + " este es el numero mayor ");
        }
    }

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio1y2 miEjercicio1 = new Ejercicio1y2();

        System.out.println("ingresa el primer numero");
        int n1 = entradaScanner.nextInt();
        System.out.println("ingresa el segundo numero");
        int n2 = entradaScanner.nextInt();

        miEjercicio1.ordenarNumero(n1, n2);

    }


}
