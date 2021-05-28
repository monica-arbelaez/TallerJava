package ejercico18;

import java.util.ArrayList;
import java.util.List;

public class ejercico18 {
    public static void main(String[] args) {
        List<ViedoJuego> listaViedoJuegos = new ArrayList<>();
        List<Serie> listaSeries = new ArrayList<>();
        Serie serieMayorTemporadas = new Serie();
        ViedoJuego videoJuegoMayorHoras = new ViedoJuego();

        listaSeries.add(new Serie("El mentalistas", 8, 'M', "Wilinton"));
        listaSeries.add(new Serie("Doctor hause", 5, 'H', "Maria"));
        listaSeries.add(new Serie("Ana la Mandona", 6, 'M', "Martin"));
        listaSeries.add(new Serie("Xmen", 2, 'M', "Antonio"));
        listaSeries.add(new Serie("CSI", "Juan"));
        listaViedoJuegos.add(new ViedoJuego("Halo", 2.5));
        listaViedoJuegos.add(new ViedoJuego("Tomb raider", 5.5));
        listaViedoJuegos.add(new ViedoJuego("El principe de persia", 3.5));
        listaViedoJuegos.add(new ViedoJuego("Metal Gear", 1.5));
        listaViedoJuegos.add(new ViedoJuego("Tenchu", 2.5));

        listaSeries.get(1).entregar();
        listaSeries.get(3).entregar();
        listaViedoJuegos.get(1).entregar();
        listaViedoJuegos.get(4).entregar();

        int contSerie = 0;
        int contVideoJ = 0;
        serieMayorTemporadas = listaSeries.get(0);
        videoJuegoMayorHoras = listaViedoJuegos.get(0);

        for (int i = 0; i < listaSeries.size(); i++) {
            Serie seriex = listaSeries.get(i);
            ViedoJuego videoJuegox = listaViedoJuegos.get(i);

            if (listaSeries.get(i).isEntregado()) {
                contSerie++;
            }
            if (listaViedoJuegos.get(i).isEntregado()) {
                contVideoJ++;
            }

//            if (i > 0) {
//                int comparacion = seriex.compareTo(serieMayorTemporadas);
//                int comparacion2 = videoJuegox.compareTo(videoJuegoMayorHoras);
//                if (comparacion == 1 || comparacion2 == 1) {
//                    serieMayorTemporadas = seriex;
//                    videoJuegoMayorHoras = videoJuegox;
//                }
//            }
            if (i > 0) {
                int comparacion = seriex.compareTo(serieMayorTemporadas);
                if (comparacion == 1) {
                    serieMayorTemporadas = seriex;
                }
            }
            if (i > 0) {
                int comparacion2 = videoJuegox.compareTo(videoJuegoMayorHoras);
                if (comparacion2 == 1) {
                    videoJuegoMayorHoras = videoJuegox;
                }
            }




        }
        System.out.println("Cantidad series estregadas = " + contSerie + "\nCantidad video juegos estregadas = " + contVideoJ + "\n");
        System.out.println("El videojuego con más horas es: " + videoJuegoMayorHoras.getTitulo() + "\n");
        System.out.println("La serie con más temporadas es: " + serieMayorTemporadas.getTitulo() + "\n");

    }
}
