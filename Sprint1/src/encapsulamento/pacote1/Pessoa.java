package encapsulamento.pacote1;

public class Pessoa {
    // em todo o projeto
    public String nome;

    // ----------


    // pode ser acessado o atributo do mesmo pacote
    //  ele pode ser acessado em outro pacote (apenas se for erdado  (herança))
    protected int dinheiro;

    //   -----------------
    // apenas na classe

    private int cpf;


    public void a() {
        cpf = 0;
    }

    // ------------------------
    int noPacote;


}


