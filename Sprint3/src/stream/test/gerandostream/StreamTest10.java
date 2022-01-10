package stream.test.gerandostream;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Stream;

// streams infinitos até o limite ser alcançado
public class StreamTest10 {

    // 2 formas
    // Stream iterate
    //      Unary;operator
    // stream generater
            //supplayer

// unary retorna o que tu passou

    public static void main(String[] args) {

        Stream.iterate(1, n ->n+2).
                limit(10).
                forEach(System.out::println);

        System.out.println("Fibonatti");

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1],n[0]+n[1]}).
                limit(10).
                forEach(a-> System.out.println(Arrays.toString(a)));


        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1],n[0]+n[1]}).
                limit(10).
                map(a->a[0]).
                forEach(System.out::println);


        // generate  aceita supplayer
        // entrada   // retorno
        //nada ->          T	Supplier

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(0,500)).
                limit(50).
                forEach(System.out::println);



    }



}
