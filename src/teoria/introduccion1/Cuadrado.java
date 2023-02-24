package teoria.introduccion1;

public class Cuadrado extends FiguraGeometricaRegular{
    //atributos

    public Cuadrado( float longitudLado) {
        super(NombreFigura.CUADRADO, 4, longitudLado);
    }
    public float getArea() {
        return getLongitudLado() * getLongitudLado();
    }
    @Override
    public String toString() {
        return String.format("%s;%.2f", super.toString(),getArea());
    }
}
