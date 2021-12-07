package POpolimorfismo.exePoli.model;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.6;




    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Tomate");
        return this.valor * IMPOSTO;
    }



  public void chamar() {}

    @Override
    public void mensagem() {
        System.out.println("Obrigado pela compra do Tomate");
    }
}
