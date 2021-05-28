package ejercicio17;

public class Lavadora extends Electrodomestico {
    private int carga;
    final int cargaDef= 5;

    public Lavadora() {
        carga = cargaDef;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        carga= cargaDef;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double total= super.precioFinal();
        total= (carga >30) ? (total+= 50) : (total+= 0);
        return total;
    }
}
