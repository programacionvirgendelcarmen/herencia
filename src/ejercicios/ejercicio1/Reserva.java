package ejercicios.ejercicio1;

import java.time.LocalDate;

public class Reserva {
    private String nombreCliente;
    private int numeroNoches;
    private LocalDate fechaReserva;
    private int numeroPersonas;
    private Pension pension;

    public Reserva(String nombreCliente, int numeroNoches,
                   int numeroPersona, Pension pension)
    {
        this.nombreCliente = nombreCliente;
        this.numeroNoches = numeroNoches;
        this.numeroPersonas = numeroPersona;
        this.fechaReserva = LocalDate.now();
        this.pension = pension;
    }

    public Pension getPension() {
        return pension;
    }

    public void setPension(Pension pension) {
        this.pension = pension;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }


}
