package polimorfismo.exePoli.visao;

import apresentacao.pilares.polimorfismo.exePoli.modelo.Computador;
import apresentacao.pilares.polimorfismo.exePoli.modelo.Tomate;
import apresentacao.pilares.polimorfismo.exePoli.servicoController.CalculadoraImposto;

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
