package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    private int numero;

    public  void VerNumero(int numero){
        Scanner entradaScanner = new Scanner(System.in);
        if(numero>=0){
            System.out.println("el número que ingreso es  : "+numero);
        }else{
            do {
                System.out.println("ingrese un numero nuvamente");
                numero =  entradaScanner.nextInt();
            }
            while (numero<=0);
                System.out.println("el número que ingreso es  : "+numero);
        }
    }

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio7 miEjercicio7 = new Ejercicio7();

        System.out.println("ingresa un número" );
        int numero = entradaScanner.nextInt();

        miEjercicio7.VerNumero(numero);
    }
}
