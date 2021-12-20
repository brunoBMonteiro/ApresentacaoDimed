package features.aOito.comportamentoLambda.test;
// o que é a function , é uma classe funcional
// tem os tipos T e o R  <T R> class Function
//  T - >  o que vai receber
// R - > O que vai voltar
// e pode ser qualquer coisa.


//MethodReferences
// basicamente é uma sintaxe que temos nas lambdas para simplificar ainda mais
//

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionLambdaTestMethodReference {
    public static void main(String[] args) {
       List<String> strings = List.of("Joao","Maria");

                    // T      // R
        List<Integer> integers = map(strings, (String s) -> s.length());
                                                // se a lambida chamar apenas um method, pode se usar o methodReference
        List<String> integers2 = map(strings, /*(String s) -> s.toUpperCase() <- antes depois - > */ String::toUpperCase);

        System.out.println(integers2);
        System.out.println(integers);



    }

    private static <T, R> List<R> map (List<T> list, Function<T, R> function ) {
        List<R> result = new ArrayList<>();


        for (T e : list) {
            // parametro que vai receber no e é do tipo String
            R r = function.apply(e);
            result.add(r);

        }
        return result;
    }

}
