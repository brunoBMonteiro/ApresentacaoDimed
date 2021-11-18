package copyReference;

public class ReferenceTest {

    public static void main(String[] args) {

        A1 a1 = new A1("Tom","10");

        A1 a2 = new A1("Jack","20");

        // perca de memoria
        a1 = a2;

        System.out.println(a1.nome);
 // Gargage collector // não tem como recuperar o a2 pois a memoria dele foi perdida
        System.out.println(a2.nome);


    }


}
