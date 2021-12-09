package estruturaDeDados.collections2.test.map;

import estruturaDeDados.collections2.dominio.Consumidor;
import estruturaDeDados.collections2.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {




        Consumidor consumidor = new Consumidor("Jack");
        Consumidor consumidor2 = new Consumidor("Ana");

       Manga manga1 = new Manga(5l,"Manga1",2.4);
       Manga manga2 = new Manga(6l,"Manga5",2.4);
       Manga manga3 = new Manga(4l,"Manga2",2.4);
       Manga manga4 = new Manga(2l,"Manga3",2.4);


        Map<Consumidor,Manga> consumidorManga = new HashMap<>();


        consumidorManga.put(consumidor, manga1);

        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> consumidorMangaEntry : consumidorManga.entrySet()) {
            System.out.println(consumidorMangaEntry);
        }


        System.out.println(consumidor.toString());
    }
}
