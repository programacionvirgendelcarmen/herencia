package teoria.accesibilidad.uno;

public class Uno {
    //accesibilidad de mas a menos
    public int x = 1;
    protected int y = 2;
    int z = 3;
    private int w = 4;
    //ejemplo de método
    protected void metodo() {
        System.out.println("método protected, valor de w: " + w);
    }
}
