package abstracao.iinterface;

// interface é usado o implements inves do extends

// não existe limite de interface para implementar
public class DatabaseLoader implements DataLoader,DataRemover{


    @Override
    public void load() {
        System.out.println("Carregando Dados ao Banco");
    }


    @Override
    public void remove() {
        System.out.println("Removendo dados dos Arquivos");
    }

     public static void retriveMaxDataSize(){
        System.out.println(" Dentro do retriveMaxDataSize na interface");
    }


}
