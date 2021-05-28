package ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio17 {
    public static List<Electrodomestico> listaElectrodomesticos = new ArrayList<>();
    public static void main(String[] args) {
        listaElectrodomesticos.add(new Television  (300.0, 22.3));
        listaElectrodomesticos.add(new Television  (100.0, 50.3));
        listaElectrodomesticos.add(new Television  (200.0, 60.3));
        listaElectrodomesticos.add(new Television  (400.0, 80.3));
        listaElectrodomesticos.add(new Television  (500.0, 90.0));
        listaElectrodomesticos.add(new Lavadora (220.3,3.0  ));
        listaElectrodomesticos.add(new Lavadora (330.3,4.0  ));
        listaElectrodomesticos.add(new Lavadora (240.3,5.0  ));
        listaElectrodomesticos.add(new Lavadora (600.3,6.0  ));
        listaElectrodomesticos.add(new Electrodomestico (220.3,3.0 ));
        System.out.println(listaElectrodomesticos);


        double sumaPrecioTv = 0.0;
        double sumaPrecioLavadora = 0.0;
        double sumaElectro = 0.0;
        for(Electrodomestico elect : listaElectrodomesticos){
            if(elect instanceof Lavadora){
                sumaPrecioLavadora += elect.precioFinal();
            }else if(elect instanceof Television){
                sumaPrecioTv += elect.precioFinal();
            }else if (elect instanceof Electrodomestico){
                sumaElectro += elect.precioFinal();
            }

        }
        System.out.println("precio total Lavadoras "+sumaPrecioLavadora + "\nprecio total televisión "+ sumaPrecioTv +"\nprecio final Electrodomesticos "+ (sumaElectro + sumaPrecioLavadora+ sumaPrecioTv));
    }


}
