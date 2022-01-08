package features.oito.comportamentolambda.zStream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    public static void main(String[] args) {


        List<String> takeWhileS = Stream.iterate("", s -> s + "s")
                .takeWhile(s -> s.length() < 10).collect(Collectors.toList());
        System.out.println(takeWhileS);


        List<Integer> takeWhile
                = Stream.of(2,2,3,4,5,6,7,8,9,10)

                 // pega da lista apenas o div 2
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(takeWhile);


        List<Integer> dropWhile
                = Stream.of(4,2,3,4,5,6,7,8,9,10)

                // exclui apenas os div por 2
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(dropWhile);
    }






}






