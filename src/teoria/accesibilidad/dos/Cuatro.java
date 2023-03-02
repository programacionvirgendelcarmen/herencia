package teoria.accesibilidad.dos;

import teoria.accesibilidad.uno.Uno;

public class Cuatro {
    Uno uno  = new Uno();
    public void mostrarDatosClaseUno() {
        System.out.println("mostrando x: " + uno.x);  //x definido public
        //System.out.println("mostrando y: " + uno.y);  y no public
        //System.out.println("mostrando z: " + uno.z);  //z no publicc
        // System.out.println("mostrando w: " + uno.w); //no puedo w definido como private
        //uno.metodo(); no es public
    }

    public static void main(String[] args) {
        Cuatro cuatro = new Cuatro();
        cuatro.mostrarDatosClaseUno();
    }
}
