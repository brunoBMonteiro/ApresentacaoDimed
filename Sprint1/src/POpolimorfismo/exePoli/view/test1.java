package POpolimorfismo.exePoli.view;
// é possivel chamar metodos declarados nas classes filhas ?


import POpolimorfismo.exePoli.model.Computador;
import POpolimorfismo.exePoli.model.Produto;
import POpolimorfismo.exePoli.model.Tomate;
public class test1 {
    public static void main(String[] args) {
     //whintening cast

        Produto produto = new Computador("Ryzen", 500);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

          // generico  - > Especifico
        Produto produto2 = new Tomate("Italiano", 500);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());








    }
}
