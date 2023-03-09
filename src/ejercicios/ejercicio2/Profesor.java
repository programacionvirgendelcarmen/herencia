package ejercicios.ejercicio2;

import java.time.LocalDate;
import java.util.Objects;

public class Profesor extends Persona{
    private Especialidad especialidad;

    public Profesor(String nombrePersona, LocalDate fechaNacimiento, String dni,
                    Especialidad especialidad) {
        super(nombrePersona, fechaNacimiento, dni);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    //juan jiménez,10-10-200,11111111H,MATEMATICAS
    @Override
    public String toString() {
        return String.format("%s,%s",
                super.toString(),especialidad);
    }


}
