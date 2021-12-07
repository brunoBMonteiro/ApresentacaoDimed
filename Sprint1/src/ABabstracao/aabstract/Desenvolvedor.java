package ABabstracao.aabstract;
//O que Faz o Codigo em Geral ?
//O que é necessario para a abstração ?
//Quais as maneiras para se obter a abstração ?

// interfaces
// abstratas

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }



    @Override
    public void calculaBonus() {
        this.salario = this.salario+this.salario * 0.2;
    }



    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }



}
