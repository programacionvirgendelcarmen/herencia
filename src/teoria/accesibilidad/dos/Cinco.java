package teoria.accesibilidad.dos;

import teoria.accesibilidad.uno.Uno;

public class Cinco extends Uno {

    public void mostrarDatosClaseUno() {
        System.out.println("mostrando x: " + x);  //x definido public
        System.out.println("mostrando y: " + y);  //y protected
        //System.out.println("mostrando z: " + z);  //z package
        // System.out.println("mostrando w: " + w); //no puedo w definido como private
        super.metodo();
        metodo();
    }

    @Override
    protected void metodo() {
        System.out.println("método de la clase cinco");
    }

    public static void main(String[] args) {
        Cinco cinco = new Cinco();
        cinco.mostrarDatosClaseUno();
    }
}
