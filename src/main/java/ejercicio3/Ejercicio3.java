package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    private double radio;

    public void areaCirculo(double radio) {
        System.out.println("El area del circulo es: " + Math.PI * Math.pow(radio, 2));
    }


    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio3 miEjercicio3 = new Ejercicio3();

        System.out.println("ingresa el radio del circulo");
        double radio = entradaScanner.nextInt();

        miEjercicio3.areaCirculo(radio);
    }
}
