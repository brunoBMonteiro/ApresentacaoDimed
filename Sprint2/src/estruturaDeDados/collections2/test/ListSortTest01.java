package estruturaDeDados.collections2.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {


        List<String> mangas = new ArrayList<>();

        mangas.add("Manga3");
        mangas.add("Manga4");
        mangas.add("Manga5");
        mangas.add("Manga1");
        mangas.add("Manga2");

        Collections.sort(mangas);


        for (String manga: mangas) {
            System.out.println(manga);

        }




        List <Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.1);
        dinheiros.add(22.1);
        dinheiros.add(44.0);


        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }
   Collections.sort(dinheiros);

        System.out.println(dinheiros);

    }
}
