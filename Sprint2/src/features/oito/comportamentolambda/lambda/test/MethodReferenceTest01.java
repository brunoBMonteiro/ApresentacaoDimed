package features.oito.comportamentolambda.lambda.test;

import features.oito.comportamentolambda.lambda.dominio.Anime;
import features.oito.comportamentolambda.lambda.service.AnimeComparators;
//Reference to a static method
import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {

    public static void main(String[] args) {


        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Hellsing", 3), new Anime("Soa", 1)));
                     // cria 2 objetos da classe anime
        // ordenado por nome
        // deste jeito não é possivel usar method reference

        // lambda se importa apenas com o target type, funcional descriptor
        // target type é o contexto que a lambda está inserido , isso quer dizer que podemos criar um metodo exatamente igual compareTo  Faz
        // funcition description é o que está fazendo, no caso do compareTo() chama 2 objetos e faz a ordenação deles



        //Collections.sort(animeList,(a1,a2)-> a1.getTitle().compareTo(a2.getTitle()) );
        // diferente do de cima , estou chamando apenas um metodo, assim podemdo usar methodReference
        animeList.sort((a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
        System.out.println("-----------------");

        animeList.sort(AnimeComparators::compareByTitle);

        System.out.println("---------");

        animeList.sort(AnimeComparators::compareByEpisodes);





        System.out.println(animeList);



    }

}
