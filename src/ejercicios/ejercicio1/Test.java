package ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Reserva> reservas = new ArrayList<>();

        Reserva reserva1 = new ApartaHotel("Marisa Perales", 2, 5,
                Pension.PENSION_COMPLETA, true);
        reservas.add(reserva1);

        Reserva reserva2 = new CasaRural("Pedro Jiménez", 4, 7,
                Pension.MEDIA_PENSION, true);
        reservas.add(reserva2);

        Reserva reserva3 = new Hotel("Gabriel Fernández", 2, 1,
                Pension.SIN_PENSION, 4);
        reservas.add(reserva3);

        mostrarDatos(reservas);

    }

    private static void mostrarDatos(List<Reserva> reservas) {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
