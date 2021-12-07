package POpolimorfismo.exePoli.model;
// O que faz o Codigo em Geral ?


public class Computador extends Produto{

    public static final double IMPOSTO = 0.10;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }



// metodo
    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Computador");
        return this.valor * IMPOSTO;
    }



    @Override
    public void mensagem() {
        System.out.println("Obrigado pela compra do Computador");
    }
}
