package stream.test.findingandmatching;

import stream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest6 {

    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("narutao",3.5),
            new LightNovel("Sword Art Online",7.6),
            new LightNovel("no game no life",2.5),
            new LightNovel("spell",4.5),
            new LightNovel("fairy",2.5),
            new LightNovel("Liga dos Campeoes ",9.5)
    ));


    public static void main(String[] args) {

                                        // 1 elemento
        System.out.println(list.stream().anyMatch(lightNovel -> lightNovel.getPrice() >8));
                                        // todos os elemttos
        System.out.println(list.stream().allMatch(lightNovel -> lightNovel.getPrice() >0));
                                        // nenhum elemento é menor que zero
        System.out.println(list.stream().noneMatch(lightNovel -> lightNovel.getPrice() <0));

        System.out.println("------------------find---------------");



       list.stream().
               filter(lightNovel -> lightNovel.getPrice() >1).
               //retorna um optional assim podendo usar o optional com stream
                       // qualquer elemento
               findAny().
               ifPresent(System.out::println);

        list.stream().
                filter(lightNovel -> lightNovel.getPrice() > 1).
                max(Comparator.comparing(lightNovel -> lightNovel.getPrice())).
                ifPresent(System.out::println);





    }
}
