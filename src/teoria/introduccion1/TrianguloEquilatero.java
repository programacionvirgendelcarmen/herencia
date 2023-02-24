package teoria.introduccion1;

public class TrianguloEquilatero extends FiguraGeometricaRegular{
    public TrianguloEquilatero( float longitudLado) {
        super(NombreFigura.TRIANGULO_EQUILATERO, 3, longitudLado);
    }
    public float getArea() {
        return (float) (Math.sqrt(3) / 4 * Math.pow(getLongitudLado(),2));
    }

    @Override
    public String toString() {
        return String.format("%s;%.2f", super.toString(),getArea());
    }
}
