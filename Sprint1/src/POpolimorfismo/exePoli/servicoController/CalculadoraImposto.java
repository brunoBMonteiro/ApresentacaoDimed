package POpolimorfismo.exePoli.servicoController;
// o que isso faz ?


import POpolimorfismo.exePoli.model.Computador;
import POpolimorfismo.exePoli.model.Produto;
import POpolimorfismo.exePoli.model.Tomate;

public class CalculadoraImposto {


    public static void calcularImpostoComputador(Cliente  cliente,Games games){

        System.out.println("Relatorio de Imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador :" + computador.getNome());
        System.out.println("Valor : "+computador.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        computador.mensagem();
    }


    public static void calcularImpostoTomate(Tomate tomate){

        System.out.println("Relatorio de Imposto do Computador");
        double imposto = tomate.calcularImposto();
        //System.out.println("Tomate :" + tomate.getNome());
       // System.out.println("Valor : "+tomate.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        tomate.mensagem();

    }


    public static void calcularImposto(Produto produto){
        double imposto= produto.calcularImposto();
        System.out.println("Tomate :" + produto.getNome());
        System.out.println("Valor : "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        produto.mensagem();
    }


}
