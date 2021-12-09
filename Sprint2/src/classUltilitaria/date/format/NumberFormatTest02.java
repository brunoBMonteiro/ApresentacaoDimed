package classUltilitaria.date.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        // java 12

        Locale LocalePT = new Locale("pt", "BR");

        Locale localeJP = Locale.JAPAN;


        Locale LocaleIT = Locale.ITALY;


        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();

        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);

        nfa[2] = NumberFormat.getCurrencyInstance(LocalePT);

        nfa[3] = NumberFormat.getCurrencyInstance(LocaleIT);

        double valor = 10_800.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }


    }
}
