package ejercicio17;

public class Television extends Electrodomestico{

    private int resolucion;
    private boolean sintonizador;

    final int resolucioDef = 20;
    final boolean sintonizadorDef = false;

    public Television() {
        resolucion = resolucioDef;
        sintonizador = sintonizadorDef;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        resolucion = resolucioDef;
        sintonizador = sintonizadorDef;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintetizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintetizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    @Override
    public double precioFinal() {
        double total= super.precioFinal();
        total=(resolucion > 40)? (total *= 1.30) :(total += 0) ;
        total=(sintonizador == true)? total+=50 : (total+=0);
        return total;
    }
}
