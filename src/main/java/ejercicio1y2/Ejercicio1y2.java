package ejercicio1y2;

public class Ejercicio1y2 {
    private int n1, n2;

    public void ordenarNumero(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("los dos numeros son iguales");
        } else if (n1 > n2) {
            System.out.println("este es el numero mayor " + n1);
        } else {
            System.out.println("este es el numero mayor " + n2);
        }
    }

    public static void main(String[] args) {
        Ejercicio1y2 miEjercicio1 =new Ejercicio1y2();
        miEjercicio1.ordenarNumero(1,2);

    }




}
