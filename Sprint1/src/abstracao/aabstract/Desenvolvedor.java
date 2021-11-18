package abstracao.aabstract;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public Desenvolvedor(){}

    @Override
    public void calculaBonus() {
        this.salario = this.salario+this.salario * 0.2;
    }

    @Override
    public void removeSalario() {

    }

    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }



}
