package abstracao.iinterface;

// Quais os TIPOS é permitido em interface ?
// Porque foi necessaria a implementação das clases comcretas nas interfaces ?

public interface DataLoader{



    public static final int MAX_DATA_SIZE =10;


    public abstract void load();



    // para que cada atualização de interface não quebre quem ta usando toda a classe
    // ou seja tenha que implementar essa nova função



   public default void checkPermission(){
       System.out.println("Fazendo Checagem de permições");
   }



     // a partir do java 8 pode se ter methodos staticos na interface
    // não pode ser sobrescrito
    public static void retriveMaxDataSize(){
        System.out.println(" Dentro do retriveMaxDataSize na interface");
    }


}
