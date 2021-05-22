package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    private int contador= 1;

    public void mostrarNumerosParesImpares(){
        while (contador<=100){
            if(contador %2 ==0){
                System.out.println("es par "+contador);
                contador++;
            }else{
                System.out.println("es impar "+ contador);
                contador++;
            }
        }

    }

    public static void main(String[] args) {
        Ejercicio5 miEjercicio5 = new Ejercicio5();
        miEjercicio5.mostrarNumerosParesImpares();
    }
}
