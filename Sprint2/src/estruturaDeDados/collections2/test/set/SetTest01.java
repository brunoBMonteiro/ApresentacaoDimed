package estruturaDeDados.collections2.test.set;

import estruturaDeDados.collections2.dominio.Manga;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class SetTest01 {
    public static void main(String[] args) {
        // set
        // não deixa elementos iguais na lista
        // eles serão organizados pelo Hash
                                 // para manter a odem de inserção
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5l,"Manga1",2.4,0));
        mangas.add(new Manga(6l,"Manga5",2.3,5));
        mangas.add(new Manga(4l,"Manga2",2.2,7));
        mangas.add(new Manga(2l,"Manga3",2.1,3));
        // exemplo  banco de dados
        // antes de inserrir na lista ele vai validar com o metodo equals se tem algum valor igual
        mangas.add(new Manga(2l,"Manga3",2.1,3));

        // set não tem index, ou set, ou seja não se pode pegar
        // para pegar algum alguma coisa desta lista precisa percorrer toda a lista

        // ele para mostrar leva em comsideração o que foi colocado no HashSet, da classse Manga

        for (Manga manga : mangas) {

            System.out.println(manga);

        }


    }
}
