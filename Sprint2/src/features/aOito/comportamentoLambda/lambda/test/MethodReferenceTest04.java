package features.aOito.comportamentoLambda.lambda.test;

import features.aOito.comportamentoLambda.lambda.dominio.Anime;
import features.aOito.comportamentoLambda.lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
//Reference to a constructor

    public static void main(String[] args) {

        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Hellsing", 3), new Anime("Soa", 1)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
// interface funcional, chamada supplier
// não recebe parametro, e retorna uma do tipo T

        // chamada de comstrutor por lambda
        // esta apenas instanciando
        Supplier<AnimeComparators> newAnimecomparatorsLambda = () -> new AnimeComparators();
        // para construtor sem parametro
        Supplier<AnimeComparators> newAnimecomparatorsMethodReference = AnimeComparators::new;
// criando objeto
         AnimeComparators animeComparators2 = newAnimecomparatorsMethodReference.get();
        System.out.println(animeComparators2);

         // tem que receber 2 argumentos e retornar o terceiro
        //     recebe um e retorna outro
        //Function<T,R>
       // Supplier<Anime> newAnimeClassMethodReference = Anime::new;

                 // recebe 2 e retorna 3  // caso precise de outro, criase a classe ...
        //BiFunction<T,U,R>
       // instanciando lambida
        BiFunction<String, Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        // convert for methodReference // java ja sabe que tem 2 parametros e coloca automaticamente
        BiFunction<String, Integer,Anime> animeBiFunction2 = Anime::new;
        // criando o objeto
        System.out.println(animeBiFunction2.apply("Hellsing",20));





    }


}
