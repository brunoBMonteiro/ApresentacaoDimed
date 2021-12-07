package estruturaDeDados.collections2.test;

import estruturaDeDados.collections2.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();


        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        mangas.add(new Manga(5l,"Manga1",2.4));
        mangas.add(new Manga(6l,"Manga5",2.4));
        mangas.add(new Manga(4l,"Manga2",2.4));
        mangas.add(new Manga(2l,"Manga3",2.4));


// -------------------------------  Manga para ser buscado
        Manga mangaToSearch = new Manga(2l,"Manga3",2.4);





       // Collections.sort(mangas);   1111111111111111111111
        // reorganizando a lista por id
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {

            System.out.println(manga);

        }


        // está retornando 2 pois está ordenando pelo nome  111111111111111111111111
       // System.out.println(Collections.binarySearch(mangas,mangaToSearch));  111111111111111111111


        // ele se perdeu
        // porque quando se esta fazendo uma ordenação customizada, ele tambem precisa ser passa essa ordenação para a busca
         System.out.println(Collections.binarySearch(mangas,mangaToSearch));


        //
        System.out.println(Collections.binarySearch(mangas,mangaToSearch,mangaByIdComparator));


    }
}
