package ejercicio12;


import java.util.Scanner;

public class Ejercicio12 {

    public void compararPalabras(String palabra1, String palabra2) {
        int maximo = 0;
        int minimo = 0;

        if (palabra1.length() == palabra2.length()) {
            System.out.println("las palabras son del mismo tamaño");
        }else{
            if (palabra1.length() > palabra2.length()) {
                maximo = palabra1.length();
                minimo = palabra2.length();
                System.out.println("la palabra "+palabra1+" es más larga que la palabra  "+ palabra2);
            } else {
                maximo = palabra2.length();
                minimo = palabra1.length();
                System.out.println("la palabra "+palabra2+" es más larga que la palabra  "+ palabra1);
            }

        }


    }

    public void compararCaracteres(String palabra1, String palabra2, int leghthPalabra) {

        for (int i = 0; i < leghthPalabra; i++) {
            if (palabra1.charAt(i) != palabra2.charAt(i)) {
                System.out.println("Las palabras no coinciaden en la posición " + i);
                System.out.println("en la palabra 1 en la letra:  " + palabra1.charAt(i) + "  en la palabra 2 en la letra: " + palabra2.charAt(i));

            }
        }
    }

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio12 miEjercicio12 = new Ejercicio12();

        System.out.println("ingresa la palabra 1");
        String palabra1 = entradaScanner.nextLine();

        System.out.println("ingrese la palabra 2");
        String palabra2 = entradaScanner.nextLine();

        int leghthPalabra = (palabra1.length() > palabra2.length()) ? palabra2.length() : palabra1.length();
        miEjercicio12.compararPalabras(palabra1, palabra2);
        miEjercicio12.compararCaracteres(palabra1, palabra2, leghthPalabra);
        System.out.println("palabra1= "+palabra1 +"  palabra 2 "+ palabra2);


    }


}
