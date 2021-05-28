package ejercicio17;

import java.util.HashMap;

public class Electrodomestico {

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    final double precioBaseDef = 100;
    final String colorDef = "blanco";
    final char consumoEnergeticoDef = 'F';
    final float pesoDef = 5;

    public Electrodomestico() {
        precioBase = precioBaseDef;
        color = colorDef;
        consumoEnergetico = consumoEnergeticoDef;
        peso = pesoDef;
    }
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = colorDef;
        consumoEnergetico= consumoEnergeticoDef;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioBaseDef() {
        return precioBaseDef;
    }

    public String getColorDef() {
        return colorDef;
    }

    public char getConsumoEnergeticoDef() {
        return consumoEnergeticoDef;
    }

    public float getPesoDef() {
        return pesoDef;
    }


    public char comprobarConsumoEnergetico(char letra) {
        char[] letraConsumo = {'A', 'B', 'C', 'D', 'F'};
        for (char l : letraConsumo) {
            if (l != letra) {
                consumoEnergetico = consumoEnergeticoDef;
            } else {
                consumoEnergetico = consumoEnergetico;
            }
        }
        return consumoEnergetico;
    }

    public String ComprobarColor(String Eletrocolor) {
        String[] colorElectro = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String micolor : colorElectro) {
            if (micolor.equals(Eletrocolor)) {
                color=color;
            }else {
                color= colorDef;
            }
        }
        return color;
    }
    public double precioFinal(){
        double total= getPrecioBase();
        final HashMap<String,Integer> precioPorconsumo = new HashMap<String, Integer>(){{
            put("A",100);
            put("B",80);
            put("C",60);
            put("D",50);
            put("E",30);
            put("F",10);
        }};
        for (int i=0; i < precioPorconsumo.size(); i++) {
            if (i + 'A' == this.getConsumoEnergetico()) {
                total += precioPorconsumo.get(Character.toString(i + 'A'));
            }
        }

        if(peso>=0 && peso<19){
            total+=10;
        }else if(peso>=20 && peso<49){
            total+=50;
        }else if(peso>=50 && peso<=79){
            total+=80;
        }else if(peso>=80){
            total+=100;
        }

        return precioBase+total;
    }

}
