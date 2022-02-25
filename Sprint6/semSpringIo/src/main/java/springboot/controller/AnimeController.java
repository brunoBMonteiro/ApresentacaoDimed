package springboot.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springboot.domain.Anime;
import springboot.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
//@AllArgsConstructor

// final contructor
@RequiredArgsConstructor

public class AnimeController {
    // injeção de dependencia
    // set
    // construtor
    @Autowired
    //localhost:8080/anime/list
    private final DateUtil dateutil;

    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(dateutil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Naruto"), new Anime("TOM"), new Anime("SOA"));
    }

}
