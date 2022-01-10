package stream.test.collectors;

import stream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("narutao",3.5),
            new LightNovel("Sword Art Online",7.6),
            new LightNovel("no game no life",2.5),
            new LightNovel("spell",4.5),
            new LightNovel("fairy",2.5),
            new LightNovel("Liga dos Campeoes ",9.5)
    ));

    public static void main(String[] args) {



        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);


        String collect1 = list.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(collect1);


    }

}
