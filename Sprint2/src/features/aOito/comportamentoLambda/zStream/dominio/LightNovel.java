package features.aOito.comportamentoLambda.zStream.dominio;

public class LightNovel {
private String title;
private double prive;

    public LightNovel(String title, double prive) {
        this.title = title;
        this.prive = prive;
    }

    public String getTitle() {
        return title;
    }

    public double getPrive() {
        return prive;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", prive=" + prive +
                '}';
    }

    

}
