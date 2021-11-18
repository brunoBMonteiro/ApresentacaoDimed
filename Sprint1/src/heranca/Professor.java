package heranca;

import java.util.Date;


//Classe extendida é terciarea.
public class Professor extends Funcionario {

    // construtor
    public Professor(String _nome, String _cpf, Date _data,String _estadocivil) {
        // chama a classe pai  Pessoa
        super(_nome, _cpf, _data,_estadocivil);


    }
    public double salario;
    public String disciplina;
}