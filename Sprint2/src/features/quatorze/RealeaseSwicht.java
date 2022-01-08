package features.quatorze;

//Switch Expression (Standard)
  //      The switch expressions that were preview in versions 12 and 13, are now standardized.

public class RealeaseSwicht {

    private static final String MONDAY = "1";
    private static final String FRIDAY = "2";
    private static final String SUNDAY = "3";
    private static final String TUESDAY = "4";


    public static void main(String[] args) {

        String day = "1";

        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;

            default      -> {
                String s = day.toString();
                int result = s.length();
                yield  result;
            }
        };











    }

}
