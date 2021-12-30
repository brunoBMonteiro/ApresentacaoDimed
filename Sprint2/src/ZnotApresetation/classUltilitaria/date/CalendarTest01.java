package ZnotApresetation.classUltilitaria.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
     // calendar é abstrato ele comtempla o calendario gregoriano / budista / japones
        Calendar c = Calendar.getInstance();
        System.out.println(c);


        // gambi
        Date data = c.getTime();

        System.out.println(data);


    }
}
