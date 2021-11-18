package abstracao.iinterface;

// não é mais uma classe agora é uma interface
// é muito parecido com abstract
public interface DataLoader{
    // todos as declarações de variaveis em interface são CONSTANTES
    //
    public static final int MAX_DATA_SIZE =10;



    // até o java 7, as interfaces tinham ter os metodos abstratos
  // java 8 ja pode ter metodos concretos

 // não é necessario pois todos os metodos na interface são public abstract
   public abstract void load();


     // porque foi implementada os metodos comcretos nas interfaces
    // para que cada atualização de interface não quebre quem ta usando toda a classe
    // ou seja tenha que implementar essa nova função

    // exemplo

    //Collection;
// por isso que o java adicionou esta funcionalidade no java 8
   public default void checkPermission(){
       System.out.println("Fazendo Checagem de permições");
   }


// a partir do java 8 pode se ter methodos staticos na interface


    // não pode ser sobrescrito
    public static void retriveMaxDataSize(){
        System.out.println(" Dentro do retriveMaxDataSize na interface");
    }


}
