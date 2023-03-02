package teoria.finalejemplos;

public class MetodoB extends MetodoA {
    @Override
    protected void metodoA() {
        System.out.println("sobreescrito");
    }
    //sobreescribir NO
  /*  @Override
    protected void metodoB() {
        System.out.println("sobreescrito");
    }*/
    //sobrecargar SI
    protected void metodoB(int z) {
        return;
    }
}
