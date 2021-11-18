package exeption;

public class ChekedVsNotChecked {

    //Checada tem varias formas de usar 
    // ou trata na main pelo metodo main
    // ou diretamente na função  com try/catch



    public static void main(String[] args) /* throws Exception*/ {



        // se a função n quiser tratar o erro pode jogar para a main
        geraErro2();

/*
        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("fim");
*/

// ##################################################### Não checada  ##############################################
        // foi tratada por opção
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

// ##################################################### Não checada  ##############################################


    }

    // ##################################################### Não checada ##############################################

    // Não checada ou não verificada     Tratar o erro é uma opção
    static void geraErro1() {
        throw new RuntimeException("Ocorreu Um Baita Erro 02");
    }

// ##################################################### Não checada  ##############################################


    //Checada

    // é preciso deixar claro
    // não é preciso caso tenha o try dentro da função
    // que lança a exeption
    // package java.lang;
    // erro é trato diretamente na função


                            //não é necessário.


    static void geraErro2() /*throws Exception */ {

        // quando é uma exeption checada é obrigado colocar  ASSINATURA do metodo



        // está dando erro pq não foi atribuida na assinatura do metodo.
      // throw new Exception("Ocorreu Um Erro 02");




       //## 1 ##
      /*
        try {
            throw new Exception("Ocorreu Um Erro 02");
        } catch (Exception e) {
            System.out.println(" Ocorreu um erro 3");

        }
*/

    }


}
