package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    private int numero;

    public void saltoDeNumero(int numero){
        for(int i= numero; i<=1000;i+=2){
            System.out.println(("\n"+i));
        }
    }

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio14 miEjercicio14 = new Ejercicio14();

        System.out.println("Escribe un numero");
        int numero = entradaScanner.nextInt();

        miEjercicio14.saltoDeNumero(numero);
    }

}
