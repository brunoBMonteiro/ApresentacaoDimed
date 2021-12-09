package estruturaDeDados.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {


    public static void main(String[] args) {

        Queue <String> fila = new LinkedList<String>();


        // add


        // os dois adicionan elementos na lista


        // diferença quando se tem fila com restrição de tamanho ex até 100 // quando a fila está cheia 
        // neste da erro lança exeption
        fila.add("Ana");

// neste retora true or false
        // neste apenas retorna false
        fila.offer("Bia");


        fila.add("Carlos");
        fila.add("Rafaela");



        // pega o primeiro elemento da fila
        //diferença de comportamento quando a fila está vazia// null

        // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.peek());


        // lança exeption
        System.out.println(fila.element());
        System.out.println(fila.element());

 // limpar a fila
        fila.clear();
// tamanho da fila
        fila.size();

        // fila esta vazia
        fila.isEmpty();


// retorna o primeiro da fila e remove ele
        // ele retornará nulo caso não tenha nada na fila
        fila.poll();
        // remove da fila mas lança exeption
        fila.remove();
    }
}
