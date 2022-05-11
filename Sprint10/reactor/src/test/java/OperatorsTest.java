
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import reactor.test.StepVerifier;

@Slf4j
public class OperatorsTest {

    @Test
    public void subscribeOnSimple() {
        Flux<Integer> flux = Flux.range(1, 4)
                .map(i -> {
                    log.info("Map 1 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                })
                .subscribeOn(Schedulers.boundedElastic())
                .map(i -> {
                    log.info("Map 2- Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                });

        StepVerifier.create(flux)
                .expectSubscription()
                .expectNext(1, 2, 3, 4)
                .verifyComplete();
    }



    @Test
    public void zipOperator() {
        Flux<String> titleFlux = Flux.just("Grand Blue", "Baki");
        Flux<String> studioFlux = Flux.just("Zero-G", "TMS Entertainment");
        Flux<Integer> episodesFlux = Flux.just(12, 24);

        Flux<Anime> animeFlux = Flux.zip(titleFlux, studioFlux, episodesFlux)
                .flatMap(tuple -> Flux.just(new Anime(tuple.getT1(), tuple.getT2(), tuple.getT3())));

        StepVerifier
                .create(animeFlux)
                .expectSubscription()
                .expectNext(
                        new Anime("Grand Blue", "Zero-G", 12),
                        new Anime("Baki", "TMS Entertainment", 24))
                .verifyComplete();


    }

    @Test
    public void zipWithOperator() {
        Flux<String> titleFlux = Flux.just("Grand Blue", "Baki");
        Flux<Integer> episodesFlux = Flux.just(12, 24);

        Flux<Anime> animeFlux = titleFlux.zipWith(episodesFlux)
                .flatMap(tuple -> Flux.just(new Anime(tuple.getT1(), null, tuple.getT2())));

        StepVerifier
                .create(animeFlux)
                .expectSubscription()
                .expectNext(
                        new Anime("Grand Blue", null, 12),
                        new Anime("Baki", null, 24))
                .verifyComplete();
    }

    @AllArgsConstructor
    @Getter
    @ToString
    @EqualsAndHashCode
    class Anime {
        private String title;
        private String studio;
        private int episodes;
    }

    //flat map many
    // then
    // zipwhen
    // eager e lazy swtichempty


}