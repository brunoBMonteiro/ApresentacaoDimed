package POpolimorfismo.exePoli.view;

import POpolimorfismo.exePoli.model.Computador;
import POpolimorfismo.exePoli.model.Tomate;
import POpolimorfismo.exePoli.servicoController.CalculadoraImposto;

public class test {
    public static void main(String[] args) {

        Computador computador = new Computador("i9", 5000);
        Tomate tomate = new Tomate("Tomate italiano", 20);

        // classe principal   // metodo               // objeto
        System.out.println("---------------------------------------");
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------------------");
         CalculadoraImposto.calcularImpostoTomate(tomate);


        System.out.println("-----------PRODUTO----------------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------------");



    }
}
