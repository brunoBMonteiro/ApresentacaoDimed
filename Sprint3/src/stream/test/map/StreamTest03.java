package stream.test.map;



import stream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {

    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("narutao",1.5),
            new LightNovel("Sword Art Online",7.6),
            new LightNovel("no game no life",2.5),
            new LightNovel("spell",1.5),
            new LightNovel("fairy",2.5),
            new LightNovel("fairy",2.5),
            new LightNovel("Liga dos Campeoes ",2.5)
    ));

    public static void main(String[] args) {
// desperciça processamento
        //    list.stream().forEach(System.out::println);


        Stream<LightNovel> stream = list.stream();
        list.forEach(System.out::println);
        Long count = stream.filter(lightNovel -> lightNovel.getPrice() <=4).count();
        System.out.println("-----------------------------------------------------");
        //             reabrindo stream
        long count2 = list.stream().
                // separa iguais
                distinct().
                filter(lightNovel -> lightNovel.getPrice() <= 4).
                count();
        //
        System.out.println(count);
        System.out.println(count2);




    }



}
