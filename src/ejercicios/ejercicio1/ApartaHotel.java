package ejercicios.ejercicio1;

public class ApartaHotel extends Reserva{
    private int numeroHabitaciones;
    private boolean limpieza;

    public ApartaHotel(
            String nombreCliente, int numeroNoches, int numeroPersonas, Pension pension,
             boolean limpieza)
    {
        super(nombreCliente, numeroNoches, numeroPersonas, pension);
        this.numeroHabitaciones =
                (numeroPersonas / 2) + (numeroPersonas % 2);
        this.limpieza = limpieza;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public boolean isLimpieza() {
        return limpieza;
    }
    //no podemos poner tres o mas personas en una habitación
    //hacemos un if para impedirlo
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        if (numeroHabitaciones > this.numeroHabitaciones)
            this.numeroHabitaciones = numeroHabitaciones;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
    //para el caso que cambien el nº de personas
    //si cambia el nº de personas, cambia el nº de habitaciones
    @Override
    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroHabitaciones = numeroPersonas / 2;
        if (numeroPersonas % 2 != 0)
            this.numeroHabitaciones++;
        super.setNumeroPersonas(numeroPersonas);

    }
    //APARTAHOTEL: Marisa Perales, 5 personas max, 2 noches, entrada 21/01/2023,
    //pensión completa, 3 habitaciones, limpieza incluida


    @Override
    public String toString() {
        String sPension = "";
        switch (getPension()){
            case PENSION_COMPLETA:
                sPension = "pensión completa";
                break;
            case MEDIA_PENSION:
                sPension = "medio pensión";
                break;
            case SIN_PENSION:
                sPension = "sin pensión";
                break;
            default:
                break;
        }
        /*String sLimpieza =  "limpieza incluida";
        if (! limpieza)
            sLimpieza = "limpieza incluida"*/
        String sLimpieza = limpieza ? "limpieza incluida" :  "limpieza no incluida" ;
        return String.format("APARTAHOTEL: %s, %d personas, %d noches, reserva %d/%d/%d, %s, %d habitaciones, %s",
                getNombreCliente(), getNumeroPersonas(), getNumeroNoches(),
                getFechaReserva().getDayOfMonth(), getFechaReserva().getMonthValue(), getFechaReserva().getYear(),
                sPension, numeroHabitaciones, sLimpieza);
    }
}
