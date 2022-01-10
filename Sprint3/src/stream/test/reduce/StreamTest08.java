package stream.test.reduce;

import stream.dominio.LightNovel;
// Reduce é uma operação final do stream, que possibilita ter um resultado unicos a partir de uma sequência de elementos

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("narutao",1.5),
                        new LightNovel("no game no life",2.5),
            new LightNovel("spell",1.5),
            new LightNovel("fairy",2.5),
            new LightNovel("Liga dos Campeoes ",4.0),
            new LightNovel("Sword Art Online",6.0)
    ));

    public static void main(String[] args) {

         list.stream().
                 map(LightNovel::getPrice).
                 filter(price -> price >3).
                 reduce(Double::sum).ifPresent(System.out::println);

// tipos primitivos
        double sum = list.stream().
                // primitivo
                 mapToDouble(LightNovel::getPrice).
                 filter(price->price > 3).
                 sum();

        System.out.println(sum);

    }

}
