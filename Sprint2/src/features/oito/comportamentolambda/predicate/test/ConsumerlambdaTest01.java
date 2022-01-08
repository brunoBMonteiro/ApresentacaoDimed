package features.oito.comportamentolambda.predicate.test;
// consumer é uma interface funcional parecida com predicate
// a diferença é que ele vai executar uma operação e ele retorna void

import java.util.List;
import java.util.function.Consumer;

public class ConsumerlambdaTest01 {

    public static void main(String[] args) {

        List<String> strings = List.of("Jack", "Ana", "Joao", "Lul");
        List<Integer> integers = List.of(1, 2, 3, 4, 4, 5, 6, 67, 8);

forEach(integers , inter -> System.out.println(inter));
        forEach(strings, (String s) -> System.out.println(s) );


    }
                                               // passar por argumento que nem o predicate
    private static <T> void forEach (List<T> list, Consumer<T> consumer ){

        for (T e : list) {
                        // parametro que vai receber no e é do tipo String
            consumer.accept(e);


        }


    }




}
