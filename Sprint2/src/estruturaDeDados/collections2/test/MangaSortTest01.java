package estruturaDeDados.collections2.test;

import estruturaDeDados.collections2.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MangaSortTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5l,"Manga1",2.4));
        mangas.add(new Manga(6l,"Manga5",2.4));
        mangas.add(new Manga(4l,"Manga2",2.4));
        mangas.add(new Manga(2l,"Manga3",2.4));



        for (Manga manga: mangas) {
            System.out.println(manga);
        }


        System.out.println("-----------------");
          // quem chama o nosso metodo compareTo é o   ( java )
          // eu que defino como ele é organizado, eu preferi ordenar pelo ID

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------------------------");
        //Comparator // #UTIL



    }
}
