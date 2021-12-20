package ABabstracao.aabstract;
// Funcionario pode ser Instanciado ?

public class FuncionarioTest01 {
    public static void main(String[] args) {



        Gerente gerente = new Gerente("Nami",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Hashi" , 15000);

        System.out.println(gerente);


        System.out.println(desenvolvedor);


    }
}
