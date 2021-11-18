package abstracao.aabstract;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // não deveria existir
        // funcionario não tem cargo

       // Funcionario funcionario = new Funcionario("Zoro",2000);
        Gerente gerente = new Gerente("Nami",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Hashi" , 15000);
        gerente.imprime();
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("d",4.0);









    }
}
