package teoria.introduccion1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<FiguraGeometricaRegular> figuras = new ArrayList();
        TrianguloEquilatero t1 = new TrianguloEquilatero(3.2f);
        TrianguloEquilatero t2 = new TrianguloEquilatero(5.2f);
        Cuadrado c1 = new Cuadrado(5.5f);
        Cuadrado c2 = new Cuadrado(4);
        PentagonoRegular p1 = new PentagonoRegular(8.8f);
        PentagonoRegular p2 = new PentagonoRegular(7.7f);
        figuras.add(t1); figuras.add(t2); figuras.add(c1);
        figuras.add(c2); figuras.add(p1); figuras.add(p2);
        mostrarFiguras(figuras);

    }

    private static void mostrarFiguras(List<FiguraGeometricaRegular> figuras) {
        for (FiguraGeometricaRegular figuraGeometricaRegular : figuras) {
            System.out.println(figuraGeometricaRegular);
        }
    }
}
