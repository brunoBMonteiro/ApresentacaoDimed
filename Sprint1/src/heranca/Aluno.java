package heranca;

import java.util.Date;

public class Aluno extends Pessoa {


    public Aluno(String _nome, String _cpf, Date _data, String _estadocivil) {

        //é usado para chamar a chasse pai , não tendo que fazer o construtor novamente
        super(_nome, _cpf, _data,_estadocivil);
    }
    public String matricula;
}