package features.fTreze;

public class PrevSwicht {

    private static final int SUBSCRIBER = 0;
    private static final int FREE_TRIAL = 1;

    public static void main(String[] args) {

      // preview Swicht

        //here
        int status = 1;


// now wifht Lambda

       boolean result = switch (status) {
            case SUBSCRIBER -> true;
            case FREE_TRIAL -> false;
            default -> throw new IllegalArgumentException("something is murky!");

       };
        System.out.println(result);


    }

}
