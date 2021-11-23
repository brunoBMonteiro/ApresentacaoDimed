package estruturaDeDados.collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
// ultimo a entrar primeiro a sair
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>() ;




        // Adicionar
        livros.add("Pequeno principe");

        // retorna boolean caso a fila esteja cheia
        livros.add("Hobbit");

        // ele da exeption caso não tenha espaco na fila // cheia
        livros.push("Senhor dos aneis");


        System.out.println(livros.peek());
        System.out.println(livros.element());

        livros.poll();
        livros.remove();
        // tbm lança exeption
        livros.pop();


















    }
}
