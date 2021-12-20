package ABabstracao.aabstract;

import ABabstracao.aabstract.Pessoa;

public abstract class Funcionario extends Pessoa {
    // não pode ser instanciada
    // foi criado para o design da aplicação
    // funcionario não existe mas é um template  ex Desenvolvedor
    // classe abstrata pode ter metodo comcreto
    // mas classe concreta não pode ter metodo abstrato
    // metodo abstrato so pode ter em classe abstrata

    // quando as duas são abstratas não é obrigado a implementar os metodos

    protected String nome;
    protected double salario;

    public Funcionario() {
    }


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        // ele da prioridade a classe filha
        calculaBonus();
    }


    // ao declarar aqui como metodo concreto, não é nescessario implementar nas outras subclasses
    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }

    // quando tem que "obrigar" todas as subclasses a declarar um metodo
    // é obrigado a implementar o metodo
    public abstract void calculaBonus();

    // do mais restritivo para o mais permissivo
    // private -> default - > protect -> public

    // se criar um metodo publico ele força a sobrescrita ser publico tambem
    // caso seja criado o metodo private , a sobrescrita permite ser todos os outros mais permissivos

}


