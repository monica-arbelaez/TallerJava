package ejercico18;

public class ViedoJuego implements Entregable{
    private String titulo;
    private double horasEstimadas;
    private boolean entregado;
    private char genero;
    private String compañia;

    final double horasEstimadasDef = 10;
    final boolean entregadoDef = false;

    public ViedoJuego() {
        horasEstimadas = horasEstimadasDef ;
        entregado = entregadoDef;
    }

    public ViedoJuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public ViedoJuego(String titulo, double horasEstimadas, char genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public double getHorasEstimadasDef() {
        return horasEstimadasDef;
    }

    public boolean isEntregadoDef() {
        return entregadoDef;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }
}
