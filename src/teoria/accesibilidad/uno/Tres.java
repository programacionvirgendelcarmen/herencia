package teoria.accesibilidad.uno;

public class Tres extends Uno {
    //Uno uno = new Uno(); no hace falta, cuando se crea un objeto
    //de la clase Tres, ANTES se crea un objeto de la clase Uno (padre)
    public void mostrarDatosClaseUno() {
        System.out.println("mostrando x: " + x);  //x definido public
        System.out.println("mostrando y: " + y);  //y definido protected
        System.out.println("mostrando z: " + z);  //z definido protected
        // System.out.println("mostrando w: " + uno.w); //no puedo w definido como private
        super.metodo();
        metodo();
    }

    @Override
    protected void metodo() {
        System.out.println("método de clase Tres");
    }

    public static void main(String[] args) {
        Tres tres = new Tres();
        tres.mostrarDatosClaseUno();
    }
}
