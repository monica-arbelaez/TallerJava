package ejercicio9;

public class Ejercicio9 {
    private String texto= "La sonrisa sera la mejor arma contra la tristeza";

    public void remplazarLetras(){
        System.out.println(texto.replaceAll("a", "e"));
    }

    public static void main(String[] args) {
        Ejercicio9 miEjercicio9= new Ejercicio9();
        miEjercicio9.remplazarLetras();
    }
}
