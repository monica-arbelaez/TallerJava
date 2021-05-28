package ejercicio16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        List<Persona> listaPersona= new ArrayList<>();

        Persona persona1 =new  Persona ("Monica", 35, 'M', 60,  1.65);

        Persona persona2 = new Persona("Wil",44,'H');

        Persona persona3 = new Persona();
        System.out.println("Ingrese el nombre de la persona3");
        persona3.setNombre(entradaScanner.nextLine());
        System.out.print("Introduce la edad de "+persona3.getNombre()+" ");
        persona3.setEdad(entradaScanner.nextInt());
        System.out.print("Selecciones sexo: H / M ");
        persona3.setSexo(entradaScanner.next().charAt(0));
        System.out.print("Introduce el peso de "+persona3.getNombre()+ " en Kg: ");
        persona3.setPeso(entradaScanner.nextInt());
        System.out.print("Introduce la altura de "+persona3.getNombre()+ " en Mts: ");
        persona3.setAltura(Double.parseDouble(entradaScanner.next()));

        listaPersona.add(persona1);
        listaPersona.add(persona2);
        listaPersona.add(persona3);

        for(Persona p : listaPersona){
            System.out.println(p);
            p.calcularImc(p.getPeso(), p.getAltura());
            p.setDNI(p.generarDni());
            p.comprobarSexo(p.getSexo());
            p.esMayorDeEdad(p.getEdad());

        };

    }
}
