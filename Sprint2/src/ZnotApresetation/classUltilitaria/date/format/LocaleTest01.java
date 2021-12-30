package ZnotApresetation.classUltilitaria.date.format;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT");
        Locale localeBr = new Locale("pt","BR");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeBr);

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);


        System.out.println("br"+df1.format(calendar.getTime()));

        System.out.println("italy"+df2.format(calendar.getTime()));


    }
}
