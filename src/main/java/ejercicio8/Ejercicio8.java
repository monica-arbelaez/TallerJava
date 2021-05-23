package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {
    private String diaSemana;

    public void diaLaboral(String diaSemana){
        switch (diaSemana) {
            case "lunes":
                System.out.println("El "+diaSemana+ " es día laboral " );
                break;
            case "martes":
                System.out.println("El "+diaSemana+ " es día laboral ");
                break;
            case "miercoles":
                System.out.println("El "+diaSemana+ " es día laboral ");
                break;
            case "jueves":
                System.out.println("El "+diaSemana+ " es día laboral ");
                break;
            case "viernes":
                System.out.println("El "+diaSemana+ " es día laboral ");
                break;
            case "sabado":
                System.out.println("El "+diaSemana+ " no es día laboral ");
                break;
            case "domingo":
                System.out.println("El "+diaSemana+ " no es día laboral ");
                break;
            default:
                System.out.println("no es un dia de la semana intenta otra vez");
        }
    }


    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio8 miEjercicio8 = new Ejercicio8();

        System.out.println("ingresa un día de la semana");
        String diaSemana = entradaScanner.nextLine();

        miEjercicio8.diaLaboral(diaSemana);

    }

}
