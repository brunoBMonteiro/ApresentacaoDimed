package heranca;

import java.util.Date;

public class Aluno extends Pessoa {


    public Aluno(String nome, String cpf, Date data, String estadocivil) {

        //é usado para chamar a chasse pai , não tendo que fazer o construtor novamente
        super(nome, cpf, data,estadocivil);
    }
    public String matricula;
}