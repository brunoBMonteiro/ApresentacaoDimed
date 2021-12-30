package AestruturaDeDados.collections2.array.test;

import java.util.*;

public class bcListSortTest01Order {
    public static void main(String[] args) {


        List<String> stringMangas = new ArrayList<>();

        stringMangas.add("Manga3");
        stringMangas.add("Manga4");
        stringMangas.add("Manga5");
        stringMangas.add("Manga1");
        stringMangas.add("Manga2");

        //Collections é a interface
        // e tem metodos estaticos que pode ser usado nas collections



        // ele vai usar o CompareTo
        // neste caso não é preciso implementar pois a Classe String ja tem Implementado
        Collections.sort(stringMangas);

// como faria isso para classes Criadas ?              < ------------------

        for (String manga: stringMangas) {
            System.out.println(manga);
        }



    }
}
