package AestruturaDeDados.collections2.aEquals;

public class Equals {
    //Ele é importante ?
// Comparação das listas, e comparação para ordenação





    public static void main(String[] args) {

        // Não são iguais pq o equals pega apenas o nome para comparação
        // tem que definir o que vai comparar
        Usuario u1 = new Usuario("Joao","fas@.com");
        Usuario u2 = new Usuario("Joao","dos@.com");

        // é falso pq esta pegando o End de memoria
        System.out.println(u1 == u2);

        // é Verdadeiro pq os nomes são iguais.
        System.out.println(u1.equals(u2));

        //HashCode
        // tem o mesmo principio do equals  mas depende dele para funcionar.


        // HashCode   ->       Equals

       //    Digamos que temos uma
// poll de 100 objetos
// primeiro compara
// a quantidade dentro
// se for o mesmo valor ele chama o equals
        // para comparar cada um dentro

        // sendo assim mais rapido que chamar o equals direto que
        // iria comparar cada um para depois entrar e comprar internamente

    }

}
