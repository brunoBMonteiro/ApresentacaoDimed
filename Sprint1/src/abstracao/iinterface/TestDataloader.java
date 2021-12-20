package abstracao.iinterface;

public class TestDataloader {
    public static void main(String[] args) {

        // não pode instanciar
        //new DataLoader();

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader =     new FileLoader();
        System.out.println("----------------------------");
        databaseLoader.load();
        fileLoader.load();
        System.out.println("----------------------------");
        databaseLoader.remove();
        fileLoader.remove();
        System.out.println("----------------------------");
        databaseLoader.checkPermission();
        fileLoader.checkPermission();


    }
}
