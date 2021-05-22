package ejercicio6;

public class Ejercicio6 {

    public void mostrarNumerosParesImpares(){

        for(int i =1; i<=100;i++){
           if(i%2==0)System.out.println("es par "+i);
           else {
               System.out.println("es Impar "+i);
           }
        }
    }

    public static void main(String[] args) {
        Ejercicio6 miEjercicio6= new Ejercicio6();
        miEjercicio6.mostrarNumerosParesImpares();
    }
}
