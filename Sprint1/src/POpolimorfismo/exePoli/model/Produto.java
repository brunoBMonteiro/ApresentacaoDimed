package POpolimorfismo.exePoli.model;


public abstract class Produto implements Taxavel,Message{

    protected String nome;
    protected double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

   

}
