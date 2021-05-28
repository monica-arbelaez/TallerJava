package ejercicio16;

import java.util.Random;


public class Persona {
    private String nombre;
    private String DNI;
    private int edad;
    private char sexo;
    private float peso;
    private double altura;


    public Persona(String nombre, int edad, char sexo, float peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        DNI= generarDni();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 220;
        altura = 1.22;
        DNI= generarDni();
    }

    public Persona() {
        nombre = "Wil";
        edad = 0;
        sexo = 'H';
        peso = 0;
        altura = 0.0;
        DNI= generarDni();
    }

    public void calcularImc(float peso, double altura) {

        final int bajoPeso = -1;
        final int pesoIdeal = 0;
        final int sobrePeso = 1;
        try {

            double miImc = peso / Math.pow(altura,2);
           if (miImc < 20) {
                System.out.println(bajoPeso + " Tu indice de masa corporal es: " + miImc + ". Estas por debajo del peso ideal");
            }
            if (miImc == 20 && miImc <= 25) {
                System.out.println(pesoIdeal + " Es tu indice de masa corporal es: " + miImc + ". Estas en tu peso ideal ");
            }
            if (miImc > 25) {
                System.out.println(sobrePeso + " Es tu indice de masa corporal es: " + miImc + ". Estas con sobre peso ");
            }

        }catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!"+ e);
        }


    }

    public void esMayorDeEdad(int edad) {
        if (this.edad > 18) {
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println(nombre + " es menor de edad");
        }

    }

    public void comprobarSexo(char sexo) {
        if ( sexo=='H' ){
            System.out.println(nombre + " es un hombre");
        } else {
            System.out.println(nombre+ " es mujer ");
        }
    }

    public String generarDni() {
        double num1;
        int num2;
        int dniRandom = 0;
        char letra;
        String Caracteres;
        String resultadoGenerarDNI;

        for (int i = 0; i < 8; i++) {
            num1 = Math.floor(Math.random() * (0 - 9) + 9);
            num2 = (int) num1;
            dniRandom = dniRandom * 10 + num2;
        }
        Caracteres = "TRWAGMYFPDXBNJZSQVHLCKET";
        int modulo = dniRandom % 23;
        letra = Caracteres.charAt(modulo);
        resultadoGenerarDNI = ("" + dniRandom + letra + "");

        return resultadoGenerarDNI;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return  "\nnombre=' " + nombre + '\'' +
                ", DNI=' " + DNI + '\'' +
                ", edad= " + edad +
                ", sexo= " + sexo +
                ", peso= " + peso +
                ", altura= " + altura +
                '}';
    }
}

