package stream.test.flatmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {

        List<List<String>> allList = new ArrayList<>();
        List<String> pais = List.of("Thor","Joao","Jack");
        List<String> maes = List.of("Maria","Helena","Alice");
        List<String> filhos = List.of("Laura","Samuel","Bernardo");
        allList.add(maes);
        allList.add(pais);
        allList.add(filhos);

        for (List<String> all : allList) {
            for (String s : all) {
                System.out.println(s);
            }

        }
// ** tirar atributo que esteja aninhado  **
                   //aqui
        // Stream<List<String>> stream = allList.stream();
        //obj final
        // Stream<String> stream = allList.stream();


        System.out.println("----");
       // Stream<Stream<String>> streamStream = allList.stream().map(l -> l.stream());


        System.out.println("----");
        allList.stream().flatMap(Collection::stream).forEach(System.out::println);





    }
}
