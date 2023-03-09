package ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Claustro {
    private String nombreCentro;
    private List<Profesor> profesores = new ArrayList<>();

    public Claustro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }
    //CRUD (Create, Read, Update, Delete)
    public boolean addProfesor(Profesor profesor){
        return profesores.add(profesor);
    }
    public boolean eliminarProfesor(Profesor profesor){
        return profesores.remove(profesor);
    }
    public Profesor buscarProfesor(String dni){
        for (Profesor profesor : profesores){
            if ( profesor.getDni().equalsIgnoreCase(dni))
                return profesor;
        }
        return null;
    }
}
