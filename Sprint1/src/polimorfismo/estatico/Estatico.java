package polimorfismo.estatico;

// sobrecarga

public class Estatico {
    String nome;
    int cpf;
    int rg;



    void documento (String nome){}

    void documento (int cpf){}

    void documento (String Nome, int cpf, int rg) {}
         // ordem trocada
    void documento (int cpf, int rg , String Nome) {}


}
