package ejercicio11;

import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio11 {
    private String frase;
    private int[] contador = {0,0,0,0,0};

    public void contarVocales(String frase ){
        System.out.println("la frase tiene una logitud de "+ frase.length());

        for(int x=0;x<frase.length();x++) {
            switch (frase.charAt(x)) {
                case 'a':case 'á':
                    contador[0]++;
                    break;
                case 'e': case 'é':
                    contador[1]++;
                    break;
                case 'i': case 'í':
                    contador[2]++;
                    break;
                case 'o':case 'ó':
                    contador[3]++;
                    break;
                case 'u':case 'ú':
                    contador[4]++;
                    break;
            }
        }
        System.out.println("Vocal A  = "+ contador[0]+"\n"+
                           "Vocal E  = "+ contador[1]+"\n"+
                           "Vocal I  = "+ contador[2]+"\n"+
                           "Vocal O  = "+ contador[3]+"\n"+
                           "Vocal U  = "+ contador[4]+"\n");
    }


    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        Ejercicio11 miEjercicio11 = new Ejercicio11();

        System.out.println("ingresa una frase");
        String frase = entradaScanner.nextLine();
        miEjercicio11.contarVocales(frase.toLowerCase());

    }
}
