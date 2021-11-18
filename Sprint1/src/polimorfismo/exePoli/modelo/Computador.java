package polimorfismo.exePoli.modelo;

public class Computador extends Produto{
            public static final double IMPOSTO = 0.10;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }


    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Computador");
        return this.valor * IMPOSTO;
    }
}
