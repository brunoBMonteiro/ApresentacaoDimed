package ABabstracao.iinterface;

public class FileLoader implements DataLoader,DataRemover{


    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }


    @Override
    public void remove() {
        System.out.println("Tirando o Arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Alterando o Removendo ");
    }



}
