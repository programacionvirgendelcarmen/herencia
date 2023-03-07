package ejercicios.ejercicio2;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor{
    private LocalDate fechaIncorporacion;

    public ProfesorTitular(String nombrePersona, LocalDate fechaNacimiento, String dni, Especialidad especialidad,
                           LocalDate fechaIncorporacion) {
        super(nombrePersona, fechaNacimiento, dni, especialidad);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
    //juan jiménez,10-10-200,11111111H,MATEMATICAS,10-10-2012
    @Override
    public String toString() {
        return String.format("%s,%d-%d-%d", super.toString(),
                fechaIncorporacion.getDayOfMonth(), fechaIncorporacion.getMonthValue(),
                fechaIncorporacion.getYear());
    }
}
