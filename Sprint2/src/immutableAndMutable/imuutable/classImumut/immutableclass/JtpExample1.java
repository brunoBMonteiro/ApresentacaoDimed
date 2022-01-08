package immutableAndMutable.imuutable.classImumut.immutableclass;

public class JtpExample1 {
// não permite modficações
    private final String s;

    JtpExample1(final String s) {
        this.s = s;
    }


    public final String getName() {
        return s;
    }




    public static void main(String[] args) {
        JtpExample1 obj = new JtpExample1("Core Java Training");
        JtpExample1 obj2 = new JtpExample1("Mudei");

        System.out.println(obj.getName());
        System.out.println(obj2.getName());
    }
}

//  Final class, which is declared as final so that it can't be extended.
//     All fields should be private so that direct access to the fields is blocked.
//     No Setters
//       All mutable fields should be as final so that they can not be iterated once initialized.
