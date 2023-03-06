package ejercicios.ejercicio1;

public class Hotel extends Reserva{
    private boolean doble = true;
    private int numeroEstrellas;

    public Hotel(String nombreCliente, int numeroNoches, int numeroPersona, Pension pension,
                 int numeroEstrellas) {
        super(nombreCliente, numeroNoches, numeroPersona, pension);
        this.numeroEstrellas = numeroEstrellas;
        if (numeroPersona == 1)
            doble = false;
    }

    public boolean isDoble() {
        return doble;
    }

    public int getNumeroEstrellas() {
        return numeroEstrellas;
    }

    public void setNumeroEstrellas(int numeroEstrellas) {
        this.numeroEstrellas = numeroEstrellas;
    }

    @Override
    public void setNumeroPersonas(int numeroPersonas) {
        if (numeroPersonas == 1)
            doble = false;
        else
            doble = true;
        super.setNumeroPersonas(numeroPersonas);
    }
    @Override
    public String toString() {
        String sDoble = doble ? "habitación doble" :  "habitación sencilla" ;

        return String.format("HOTEL: %s, %d personas, %d noches, reserva %d/%d/%d, %s, %s",
                getNombreCliente(), getNumeroPersonas(), getNumeroNoches(),
                getFechaReserva().getDayOfMonth(), getFechaReserva().getMonthValue(), getFechaReserva().getYear(),
                Helper.getTipoPension(getPension()), sDoble );
    }
}
