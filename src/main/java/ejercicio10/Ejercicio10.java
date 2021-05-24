package ejercicio10;
import java.util.Scanner;

import ejercicio3.Ejercicio3;

import java.util.Scanner;

public class Ejercicio10 {

    private String frase;

    public void eliminarEspacios(String frase ){
        System.out.println("esta es su frase sin espacios: "+frase.replace(" ", ""));
    }


    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio10 miEjercicio10 = new Ejercicio10();

        System.out.println("ingresa una frase");
        String frase = entradaScanner.nextLine();
        miEjercicio10.eliminarEspacios(frase);

    }
}
