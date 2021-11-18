package polimorfismo.exePoli.modelo;

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

}
