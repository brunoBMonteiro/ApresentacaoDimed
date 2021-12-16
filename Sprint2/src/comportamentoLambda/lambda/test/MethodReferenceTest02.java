package comportamentoLambda.lambda.test;

import comportamentoLambda.lambda.dominio.Anime;
import comportamentoLambda.lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {

    public static void main(String[] args) {

        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Hellsing", 3), new Anime("Soa", 1)));

        // a unica diferença é que tem que instaciar a classe antes

        animeList.sort(animeComparators::compareByEpisodesNonStatic);


        System.out.println(animeList);





    }







}
