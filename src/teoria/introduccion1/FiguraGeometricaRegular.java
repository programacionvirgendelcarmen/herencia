package teoria.introduccion1;

import java.util.Objects;

public class FiguraGeometricaRegular {
    private NombreFigura nombreFigura;
    private int numeroLados;
    private float longitudLado;

    public FiguraGeometricaRegular(NombreFigura nombreFigura, int numeroLados, float longitudLado) {
        this.nombreFigura = nombreFigura;
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public NombreFigura getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(NombreFigura nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public float getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(float longitudLado) {
        this.longitudLado = longitudLado;
    }
    public float getPerimetro(){
        return numeroLados * longitudLado;
    }

    @Override
    public String toString() {
        return String.format("%S;%d;%.2f;%.2f",
                nombreFigura, numeroLados, longitudLado, getPerimetro());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiguraGeometricaRegular that = (FiguraGeometricaRegular) o;
        return numeroLados == that.numeroLados && Float.compare(that.longitudLado, longitudLado) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroLados, longitudLado);
    }
}
