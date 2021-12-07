package POpolimorfismo.estatico;

// sobrecarga

public class Estatico {
    String nome;
    int cpf;
    int rg;



    void documento (String nome){

        System.out.println("Metodo "+nome);
    }

    void documento (int cpf){
        System.out.println("Metodo CPF : "+cpf);
    }


    void documento (String nome, int cpf, int rg) {
        System.out.println("Metodo "+nome +"CPF : "+cpf+  "RG:"+rg);
    }
         // ordem trocada

    void documento (int cpf, int rg , String nome) {
        System.out.println("CPF : "+cpf +" RG: "+rg+  "Metodo "+nome);
    }


}
