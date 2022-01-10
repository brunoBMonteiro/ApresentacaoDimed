package stream.test.gerandostream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// stream sem presicar criar listas
public class StreamTest09 {
    public static void main(String[] args) {
        //1 - 50 last inclusive
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n+ " "));
        System.out.println();
        // 1 - 49  last exclusive
        IntStream.range(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n+ " "));

        System.out.println();

        Stream.of("Tom","Joao","Maria").map(String::toUpperCase).forEach(s -> System.out.print(s + " "));


        System.out.println();
        int num[] = {1,2,3,4,5};
        Arrays.stream(num).average().ifPresent(System.out::println);





    }
}
