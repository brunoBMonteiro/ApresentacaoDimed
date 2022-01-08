package features.oito.comportamentolambda.lambda.test;
//Reference to an instance method of an arbitrary object of a particular type
// usar a classe e não o objeto , e não static

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Hellsi","Soa"));
      // fazer a comparação da lista
        // ja sabe que a String implementa comparable

               // Classe  // method não static
        list.sort(String::compareTo);
        System.out.println(list);

// numero em string para integer pode ter atraves da classe funcional

        // lambda
       // Function<String, Integer> numStringToInteger = s-> Integer.parseInt(s);
        // method reference
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));


// verificar se tem um elemento dentro de uma lista
        // tem a predicate que faz um teste, e retorna um boolean, mas tem apenas 1 parametro
        // para isso o java criou o

        BiPredicate<List<String>, String> chekname = List::contains;

        System.out.println(chekname.test(list,"Soa"));




    }






}
