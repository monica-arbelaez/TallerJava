package ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio13 {

    public void fechaHoraActual(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        Date fecha = new Date();

        System.out.println(formatoFecha.format(fecha));
        System.out.println(formatoHora.format(fecha));
    }
    public static void main(String[] args) {
        Ejercicio13 miEjercicio13 =new Ejercicio13();
        System.out.println("\nLa fecha y hora actual es:");
        miEjercicio13.fechaHoraActual();

    }

}
