package heranca;

import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;
    public String estadocivil;
// pessoa herda de objeto
// nomeclatura 

    public Pessoa(String _nome, String _cpf, Date _data,String _estadocivil) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
        this.estadocivil = _estadocivil;
    }



}