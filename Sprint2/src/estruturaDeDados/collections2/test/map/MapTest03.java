package estruturaDeDados.collections2.test.map;

import estruturaDeDados.collections2.dominio.Consumidor;
import estruturaDeDados.collections2.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

   List<String> frutas = List.of("maça", "laranja");

public class MapTest03 {
    public static void main(String[] args) {

       // Consumidor consumidor = new Consumidor("Jack");
       // Consumidor consumidor2 = new Consumidor("Ana");

        Manga manga1 = new Manga(5l,"Manga1",2.4);
        Manga manga2 = new Manga(6l,"Manga5",2.4);
        Manga manga3 = new Manga(4l,"Manga2",2.4);
        Manga manga4 = new Manga(2l,"Manga3",2.4);


        
        
        List<Manga> mangaList = new Lis();

        Map<Consumidor, List<Manga> > consumidorManga = new HashMap<>();





    }

}
