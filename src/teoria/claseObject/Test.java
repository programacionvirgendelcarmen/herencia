package teoria.claseObject;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Persona p1 = new Persona(
                "juan", "garrido fernández", "111111111h");
        Persona p2 = new Persona(
                "juan", "garrido fernández", "111111111h");
        Persona p3 = new Persona(
                "juani", "garcía loreto", "12345678g");
        System.out.println("p1 == p2 " + (p1 == p2));
        System.out.println("p1.equals(p2) " + p1.equals(p2));

        System.out.println("p1 == p3 " + (p1 == p3));
        System.out.println("p1.equals(p2) " + p1.equals(p3));

        Persona p4 = p1;
        System.out.println("p1 == p4 " + (p1 == p4));
        System.out.println("p1.equals(p4) " + p1.equals(p4));

        Persona p1Clone = (Persona) p1.clone();

        p4.setDni("sin dni");
        System.out.println("Dni de p4: " + p4.getDni());
        System.out.println("Dni de p1: " + p1.getDni());
        System.out.println("Dni de p1Clone: " + p1Clone.getDni());




    }
}
