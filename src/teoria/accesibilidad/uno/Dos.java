package teoria.accesibilidad.uno;

public class Dos {
    Uno uno = new Uno();
    public void mostrarDatosClaseUno() {
        System.out.println("mostrando x: " + uno.x);  //x definido public
        System.out.println("mostrando y: " + uno.y);  //y definido protected
        System.out.println("mostrando z: " + uno.z);  //z definido protected
       // System.out.println("mostrando w: " + uno.w); //no puedo w definido como private
        uno.metodo();
        metodo();
    }
    protected void metodo() {
        System.out.println("método de clase Dos");
    }

    public static void main(String[] args) {
        Dos dos = new Dos();
        dos.mostrarDatosClaseUno();
    }
}
