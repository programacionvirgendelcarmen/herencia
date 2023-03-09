package ejercicios.ejercicio2;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
    private String nombrePersona;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona(String nombrePersona, LocalDate fechaNacimiento, String dni) {
        this.nombrePersona = nombrePersona;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    //juan jiménez,10-10-200,11111111H

    @Override
    public String toString() {
        return String.format("%S,%d-%d-%d,%S", nombrePersona,
                fechaNacimiento.getDayOfMonth(),fechaNacimiento.getMonthValue(),
                fechaNacimiento.getYear(), dni);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni.equalsIgnoreCase(persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
