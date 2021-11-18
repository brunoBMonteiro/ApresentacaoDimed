package heranca;

import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;
    public String estadocivil;
// pessoa herda de objeto
// nomeclatura 


    public Pessoa(String nome, String cpf, Date data_nascimento, String estadocivil) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.estadocivil = estadocivil;
    }
}