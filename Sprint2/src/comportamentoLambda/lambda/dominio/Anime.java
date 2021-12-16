package comportamentoLambda.lambda.dominio;
//Method Reference
// tem 4 tipos de uso

/*
Reference to a static method	ContainingClass::staticMethodName	Person::compareByAge
        MethodReferencesExamples::appendStrings
Reference to an instance method of a particular object	containingObject::instanceMethodName	myComparisonProvider::compareByName
        myApp::appendStrings2
Reference to an instance method of an arbitrary object of a particular type	ContainingType::methodName	String::compareToIgnoreCase
        String::concat
Reference to a constructor	ClassName::new	HashSet::new
*/
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
