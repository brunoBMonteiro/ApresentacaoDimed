package features.aOito.comportamentoLambda.zStream.test;

import features.aOito.comportamentoLambda.zStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {

    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("narutao",1.5),
            new LightNovel("Sword Art Online",7.6),
            new LightNovel("no game no life",2.5),
            new LightNovel("spell",1.5),
            new LightNovel("fairy",2.5),
            new LightNovel("Liga dos Campeoes ",2.5)
    ));

    public static void main(String[] args) {
 // a maioria das collections tem um metodo Stream
                                    // retorno stream de light novel
                                    // vai trabalhar com essa sequencia de elementos

        // sendo assim Stream Trabalha com operações

        // são divididas em duas
        // intermediarias  -- é uma ação que retorna um propio stream, podendo encadear os streams
        // finais -- são para fechamento do stream ou retorno / agrupamento  Retornando R

       List<String> title = list.stream()
               .sorted(Comparator.comparing(LightNovel::getTitle))
               .filter(lightNovel -> lightNovel.getPrice() <= 4)
               .limit(3).map(LightNovel::getTitle)
               // final
               .collect(Collectors.toList());

        System.out.println(title);



    }



}
