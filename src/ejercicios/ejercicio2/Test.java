package ejercicios.ejercicio2;

import java.util.List;
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Profesor pt1 = new ProfesorTitular("elisa fernández",
                LocalDate.of(1999,10,3), "1111111111a",
                Especialidad.INFORMATICA, LocalDate.of(2020,12,1));
        Profesor pt2 = new ProfesorTitular("ramón fernández",
                LocalDate.of(1989,10,3), "1111111111b",
                Especialidad.BIOLOGIA_GEOLOGIA, LocalDate.of(2010,12,1));
        Profesor pi1 = new ProfesorInterino("gabriel fernández",
                LocalDate.of(1979,10,3), "1111111111c",
                Especialidad.INGLES, 5);
        Profesor pi2 = new ProfesorInterino("rosa fernández",
                LocalDate.of(1979,10,30), "1111111111d",
                Especialidad.FISICA_QUIMICA, 1);
        Profesor pi3 = new ProfesorInterino("luis fernández",
                LocalDate.of(1970,10,3), "1111111111f",
                Especialidad.MATEMATICAS, 6);
        Claustro claustro = new Claustro("centro uno");
        claustro.addProfesor(pt1);
        claustro.addProfesor(pt2);
        claustro.addProfesor(pi1);
        claustro.addProfesor(pi2);
        claustro.addProfesor(pi3);

       // System.out.println(claustro);
        System.out.printf("CENTRO: %s%n", claustro.getNombreCentro());
        List<Profesor> profesores = claustro.getProfesores();
        for (Profesor profesor: profesores) {
            System.out.println(profesor);
        }
        Profesor profesor1 = claustro.buscarProfesor("1111111111d");
        mostrarProfesor(profesor1);
        Profesor profesor2 = claustro.buscarProfesor("1111111111j");
        mostrarProfesor(profesor2);
        Profesor profesor3 = new ProfesorInterino(
                null, null, "1111111111d", null, 0);
        boolean borrado1 = claustro.eliminarProfesor(profesor3);
        System.out.printf("Borrado con éxito: %B%n", borrado1);
        Profesor profesor4 = new Profesor(
                null, null, "1111111111j", null);
        boolean borrado2 = claustro.eliminarProfesor(profesor4);
        System.out.printf("Borrado con éxito: %B%n", borrado2);
        System.out.println("------LISTA DE PROFESORADO-------");
        claustro.getProfesores().forEach(System.out::println);
    }

    public static void mostrarProfesor(Profesor profesor){
        System.out.println("----BUSCANDO PROFESOR----");
        if (profesor == null) {
            System.out.println("no existe profesor");
            return;
        }
        System.out.println(profesor);
    }

}
