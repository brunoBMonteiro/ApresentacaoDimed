package estruturaDeDados.collections2.test;

import estruturaDeDados.collections2.dominio.Manga;

import java.util.HashSet;
import java.util.Set;


public class SetTest01 {
    public static void main(String[] args) {
        // set
        // não deixa elementos iguais na lista

        
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5l,"Manga1",2.4,0));
        mangas.add(new Manga(6l,"Manga5",2.4,5));
        mangas.add(new Manga(4l,"Manga2",2.4,7));
        mangas.add(new Manga(2l,"Manga3",2.4,3));






    }
}
