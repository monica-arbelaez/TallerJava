package ejercico18;

public class Serie implements Entregable {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private char genero;
    private String creador;

    final int numeroTemporadasDef = 3;
    final boolean entregadoDef= false;

    public Serie() {
        numeroTemporadas = numeroTemporadasDef ;
        entregado = entregadoDef;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, char genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public char getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getNumeroTemporadasDef() {
        return numeroTemporadasDef;
    }

    public boolean isEntregadoDef() {
        return entregadoDef;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero=" + genero +
                ", creador='" + creador + '\'' +
                ", numeroTemporadasDef=" + numeroTemporadasDef +
                ", entregadoDef=" + entregadoDef +
                '}';
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
        Serie resultadoTemporadas =(Serie) a;

        return 0;
    }
}
