package ejercico18;

import java.util.ArrayList;
import java.util.List;

public class ejercico18 {
    public static void main(String[] args) {
        List<ViedoJuego> listaViedoJuegos = new ArrayList<>();
        List<Serie> listaSeries = new ArrayList<>();
        listaSeries.add(new Serie("El mentalistas", "Wilinton"));
        listaSeries.add(new Serie("Doctor hause", "Maria"));
        listaSeries.add(new Serie("Ana la Mandona", "Martin"));
        listaSeries.add(new Serie("Xmen", "Antonio"));
        listaSeries.add(new Serie("CSI", "Juan"));
        listaViedoJuegos.add(new ViedoJuego("Halo",2.5));
        listaViedoJuegos.add(new ViedoJuego("Tomb raider",5.5));
        listaViedoJuegos.add(new ViedoJuego("El principe de persia",3.5));
        listaViedoJuegos.add(new ViedoJuego("Metal Gear",7.5));
        listaViedoJuegos.add(new ViedoJuego("Tenchu",6.5));

        listaSeries.get(1).entregar();
        listaSeries.get(3).entregar();
        listaViedoJuegos.get(1).entregar();
        listaViedoJuegos.get(4).entregar();

        int contSerie = 0;
        int contVideoJ = 0;
        for(int i=0; i < listaSeries.size(); i++){

            if(listaSeries.get(i).isEntregado()){
                contSerie++;
            }
            if(listaViedoJuegos.get(i).isEntregado()){
                contVideoJ++;
            }

        }
        System.out.println("Cantidad series estregadas = " + contSerie+ "\nCantidad series estregadas = "+contVideoJ );
    }


}
