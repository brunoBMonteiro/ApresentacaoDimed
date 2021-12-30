package Coptional;

import Coptional.dominio.Manga;
import Coptional.repsitory.MangaRepository;

import java.util.Optional;

public class OptionalTest03 {

    public static void main(String[] args) {


        Optional<Manga> mangaByTitle = MangaRepository.findBytitle("Manga1");

        mangaByTitle.ifPresent(m-> m.setTitle("Manga 100000"));

        System.out.println(mangaByTitle);
        System.out.println("--------------------");

        Optional<Manga> mangaByID = MangaRepository.findById(2);

        mangaByID.ifPresent(m-> m.setId(400));

        System.out.println(mangaByID);
    }
}
