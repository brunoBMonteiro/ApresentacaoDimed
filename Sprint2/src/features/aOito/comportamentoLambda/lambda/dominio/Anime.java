package features.aOito.comportamentoLambda.lambda.dominio;

public class Anime {

    private String title;
    private int episodes;

    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }


    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }


    public int getEpisodes() {
        return episodes;
    }

    public String getTitle() {
        return title;
    }
}
