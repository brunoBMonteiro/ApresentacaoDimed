public class Ex1 {
    public static String final_state_f(int rex, int bob, int oil) {
        if ((rex + 1 == oil) && (bob - 1 == oil)) {
            return "oli";
        } else if (rex + 1 == oil) {
            return "rex";
        } else if (bob - 1 == oil) {
            return "bob";
        } else return "nada";
    }

    public static void test(int rex, int bob, int oli) {
        var final_state = false;
        int pos_rex = rex;
        int pos_bob = bob;
        int pos_oli = oli;

        while (true) {
            pos_rex = pos_rex + 1;
            pos_bob = pos_bob - 1;
            String vencedor = final_state_f(pos_rex, pos_bob, pos_oli);
            switch (vencedor) {
                case "oli":
                    System.out.println("oli venceu!!!");
                    final_state = true;
                    break;
                case "rex":
                    System.out.println("Rex venceu");
                    final_state = true;
                    break;
                case "bob":
                    System.out.println("BOB Venceu");
                    final_state = true;
                    break;
            }
            if (final_state) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        test(0, 10, 6);
    }
}







