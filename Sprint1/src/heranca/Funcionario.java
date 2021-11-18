package heranca;

import java.util.Date;


public class Funcionario extends Pessoa {


    public double salario;
    public Date data_admissao;
    public String cargo;


    public Funcionario(String nome, String cpf, Date data_nascimento, String estadocivil) {
        super(nome, cpf, data_nascimento, estadocivil);
        this.salario = salario;
        this.data_admissao = data_admissao;
        this.cargo = cargo;
    }
}