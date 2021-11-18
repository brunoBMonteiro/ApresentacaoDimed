package heranca;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Aluno i = new  Aluno("Jose Francisco", "123.456.789-00", new Date(),"Solteiro");
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("Data de nascimento: " + i.data_nascimento.toString());
        System.out.println("Estado Civil: " + i.estadocivil+"\n\n");



        Professor j = new Professor("Joao Almeida", "123.456.789-00", new Date(),"Casado");
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + j.nome);
        System.out.println("CPF: " + j.cpf);
        System.out.println("Data de nascimento: " + j.data_nascimento.toString());
        System.out.println("Estado Civil: " + i.estadocivil+"\n\n");


    }
}