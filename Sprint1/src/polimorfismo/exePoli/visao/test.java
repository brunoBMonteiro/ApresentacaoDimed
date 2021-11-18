package polimorfismo.exePoli.visao;

import polimorfismo.exePoli.modelo.Computador;
import polimorfismo.exePoli.modelo.Produto;
import polimorfismo.exePoli.modelo.Tomate;
import polimorfismo.exePoli.servicoController.CalculadoraImposto;

public class test {
    public static void main(String[] args) {

        Computador computador = new Computador("Dalhe", 5000);
        Tomate tomate = new Tomate("Tomate italiano", 20);

        // classe principal   // metodo               // objeto
        System.out.println("---------------------------------------");
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------------------");
         CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("----------------------------------------");
        System.out.println("-----------PRODUTO----------------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------------");



    }
}
