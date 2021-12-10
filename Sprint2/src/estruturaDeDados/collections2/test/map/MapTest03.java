package estruturaDeDados.collections2.test.map;

import estruturaDeDados.collections2.dominio.Consumidor;
import estruturaDeDados.collections2.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapTest03 {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Jack");
        Consumidor consumidor7 = new Consumidor("Ana");


        Manga manga1 = new Manga(5l,"Manga1",2.4);
        Manga manga2 = new Manga(6l,"Manga5",2.4);
        Manga manga3 = new Manga(4l,"Manga2",2.4);
        Manga manga4 = new Manga(2l,"Manga3",2.4);


        

        List<Manga> mangaList = List.of(manga1, manga2);

        Map<Consumidor, List<Manga> > consumidorManga = new HashMap();
        consumidorManga.put(consumidor,mangaList);

        for (Map.Entry<Consumidor, List<Manga>> consumidorListEntry : consumidorManga.entrySet()) {


            System.out.println("-------"+consumidorListEntry.getKey().getNome());
            for (Manga manga : consumidorListEntry.getValue()) {

                System.out.println("----------"+manga.getNome());
            }


        }


    }

}
