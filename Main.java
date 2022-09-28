import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main{
    public static void main(String[] args) {

        Calendar fechaNacimiento = new GregorianCalendar(2002, 3, 7);
        Calendar ahora = Calendar.getInstance();

        long edadEnDias = (ahora.getTimeInMillis() - fechaNacimiento.getTimeInMillis())
                / 1000 / 60 / 60 / 24;

        int anos = Double.valueOf(edadEnDias / 365.25d).intValue();
        int dias = Double.valueOf(edadEnDias % 365.25d).intValue();

        System.out.println(String.format("Tienes %d años y %d días", anos, dias));
    }
}

