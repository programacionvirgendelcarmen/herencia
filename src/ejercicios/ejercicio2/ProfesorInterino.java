package ejercicios.ejercicio2;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
    private int mesesContratacion;

    public ProfesorInterino(String nombrePersona, LocalDate fechaNacimiento, String dni, Especialidad especialidad,
                            int mesesContratacion) {
        super(nombrePersona, fechaNacimiento, dni, especialidad);
        this.mesesContratacion = mesesContratacion;
    }

    public int getMesesContratacion() {
        return mesesContratacion;
    }

    public void setMesesContratacion(int mesesContratacion) {
        this.mesesContratacion = mesesContratacion;
    }
    //juan jiménez,10-10-200,11111111H,MATEMATICAS,5

    @Override
    public String toString() {
        return String.format("%s,%d", super.toString(), mesesContratacion);
    }
}
