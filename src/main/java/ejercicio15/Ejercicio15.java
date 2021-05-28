package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    private String menu;

    public void listarmenu() {
        menu = "******** GESTION CINEMATOGRÁFICA ******** \n" +
                "1-NEUVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE PELICULA DE LOS ACTORES\n" +
                "8-SALIR\n";
        System.out.println(menu);
    }

    public void elegirOpciones() {
        Scanner entradaScanner = new Scanner(System.in);
        boolean repetirMenu = true;
        do {
            listarmenu();
            System.out.println("Ingrese el numero de la opcion que quiere elegir");
            int opcion = entradaScanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1-NUEVO ACTOR\n\n");
                    break;
                case 2:
                    System.out.println("2-BUSCAR ACTOR\n\n");
                    break;
                case 3:
                    System.out.println("3-ELIMINAR ACTOR\n\n");
                    break;
                case 4:
                    System.out.println("4-MODIFICAR ACTOR\n\n");
                    break;
                case 5:
                    System.out.println("5-VER TODOS LOS ACTORESR");
                    break;
                case 6:
                    System.out.println("6-VER PELICULAS DE LOS ACTORES");
                    break;
                case 7:
                    System.out.println("7-VER CATEGORIA DE PELICULA DE LOS ACTORES");
                    break;
                case 8:
                    System.out.println("8-SALIR");
                    repetirMenu = false;
                    break;
                default:
                    System.out.println("\n....¡¡¡Selecciona una opcion del 1 al 8!!....\n");
            }
        } while (repetirMenu == true);
    }

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio15 miEjercicio15 = new Ejercicio15();

        miEjercicio15.elegirOpciones();
    }
}
