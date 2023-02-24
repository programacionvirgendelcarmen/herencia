package teoria.introduccion1;

public class PentagonoRegular extends FiguraGeometricaRegular{
    public PentagonoRegular( float longitudLado) {
        super(NombreFigura.PENTAGONO_REGULAR, 5, longitudLado);
    }
    public float getArea() {
        return 1.72048f * getLongitudLado() * getLongitudLado();
    }
    @Override
    public String toString() {
        return String.format("%s;%.2f", super.toString(),getArea());
    }
}
