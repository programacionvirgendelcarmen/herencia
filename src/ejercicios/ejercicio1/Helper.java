package ejercicios.ejercicio1;

public class Helper {
    public static String getTipoPension(Pension pension) {
        switch (pension){
            case PENSION_COMPLETA:
                return  "pensión completa";

            case MEDIA_PENSION:
                return  "medio pensión";

            case SIN_PENSION:
                return "sin pensión";

            default:
                break;
        }
        return "";
    }
}
