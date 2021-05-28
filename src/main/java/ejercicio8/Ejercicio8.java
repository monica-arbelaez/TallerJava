package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {
    private String diaSemana;

    public void diaLaboral(String diaSemana){
        switch (diaSemana) {
            case "domingo":case "sabado":
                System.out.println("El " + diaSemana + " no es un día laboral.");
                break;

            default:
                System.out.println("El " + diaSemana + " es un día laboral.");

        }
    }


    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio8 miEjercicio8 = new Ejercicio8();

        System.out.println("ingresa un día de la semana");
        String diaSemana = entradaScanner.nextLine();

        miEjercicio8.diaLaboral(diaSemana.toLowerCase());

    }

}
