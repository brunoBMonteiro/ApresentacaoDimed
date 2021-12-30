package Coptional.repsitory;

import Coptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {

    private static List<Manga> mangas = List.of(new Manga(2,"Manga1",5)
                                              ,new Manga(1,"Manga5",10)  );


    public static Optional<Manga> findBytitle(String title) {
        return findBy(m->m.getTitle().equals(title));
}

    public static Optional<Manga> findById(Integer id) {
        return findBy(m->m.getId().equals(id));
    }





private static Optional<Manga> findBy (Predicate<Manga> predicate){
    Manga found = null;

    for (Manga manga : mangas) {
        if (predicate.test(manga)) {
            found = manga;
        }
    }
    return Optional.ofNullable(found);


}






}
