package heranca;

import java.util.Date;


//Classe extendida é terciarea.
public class Professor extends Funcionario {

    // construtor
    public Professor(String nome, String cpf, Date data_nascimento, String estadocivil) {
        // chama a classe pai  Pessoa
        super(nome, cpf, data_nascimento, estadocivil);
    }


    public double salario;
    public String disciplina;
}