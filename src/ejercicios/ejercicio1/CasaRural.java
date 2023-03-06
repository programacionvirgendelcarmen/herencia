package ejercicios.ejercicio1;

public class CasaRural extends Reserva{
    private int numeroHabitaciones;
    private boolean piscina;

    public CasaRural(String nombreCliente, int numeroNoches, int numeroPersonas, Pension pension,
                     boolean piscina) {
        super(nombreCliente, numeroNoches, numeroPersonas, pension);
        this.piscina = piscina;
        if (numeroPersonas % 3 != 0)
            this.numeroHabitaciones = numeroPersonas / 3 + 1;
        else
            this.numeroHabitaciones = numeroPersonas / 3;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    /*public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }*/

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public void setNumeroPersonas(int numeroPersonas) {
        if (numeroPersonas % 3 != 0)
            this.numeroHabitaciones = numeroPersonas / 3 + 1;
        else
            this.numeroHabitaciones = numeroPersonas / 3;
        super.setNumeroPersonas(numeroPersonas);
    }
    @Override
    public String toString() {
        String sPiscina = piscina ? "piscina incluida" :  "piscina no incluida" ;

        return String.format("CASA RURAL: %s, %d personas, %d noches, reserva %d/%d/%d, %s, %d habitaciones, %s",
                getNombreCliente(), getNumeroPersonas(), getNumeroNoches(),
                getFechaReserva().getDayOfMonth(), getFechaReserva().getMonthValue(), getFechaReserva().getYear(),
                Helper.getTipoPension(getPension()), numeroHabitaciones, sPiscina);
    }
}
