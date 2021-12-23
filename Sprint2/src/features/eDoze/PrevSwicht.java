package features.eDoze;

public class PrevSwicht {

  //  Java 12 got a couple new features and clean-ups,
   // but the only ones worth mentioning here are Unicode 11 support
    //preview of the new switch expression


    private static final int SUBSCRIBER = 1;
    private static final int FREE_TRIAL = 2;

    public static void main(String[] args) {

        // preview Swicht
        int status = 0;

        switch (status) {
            case SUBSCRIBER:
                // code block
                break;
            case FREE_TRIAL:
                // code block
                break;
            default:
                // code block
        }
    }
}
