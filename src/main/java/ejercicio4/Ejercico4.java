package ejercicio4;

import java.util.Scanner;

public class Ejercico4 {
    private final double iva = 0.21;
    private double precio;

    public void CalcularPrecio(double precio){
        double ivaProducto=  precio* iva;
        precio = precio + ivaProducto;

        System.out.println("su precio con IVA el 21% es: "+ precio);
    }

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercico4 miEjercicio4= new Ejercico4();

        System.out.println("ingresa el precio de un producto");
        double precio=Double.parseDouble(entradaScanner.nextLine());
        miEjercicio4.CalcularPrecio(precio);


    }
}
