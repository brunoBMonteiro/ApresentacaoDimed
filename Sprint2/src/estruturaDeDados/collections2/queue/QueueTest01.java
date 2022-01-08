package estruturaDeDados.collections2.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
       // FIFO -- Firt in First Out
        // LIFO -- Last in Last Out
        // fila de banco  - primeiro a entrar primeiro a ser atendido

        // é parecido com os Sorteds, por que a classe que usar precisa ser  -- comparable --
                // foi criada para trabalhar com prioridades customizadas



        Queue<String> fila = new PriorityQueue<>();

        fila.add("D");
        fila.add("A");
        fila.add("B");
        fila.add("H");


        for (String s : fila) {
            System.out.println(s);
        }
        System.out.println("----------------");
        // ele vai manter a ordem mão nao necessariamente em memoria,
        // dentro do Heap , mas sim quando tirar ele do heap/memoria, ele vai vir ordenado
        // com foi definido no comparable ou comparator

        System.out.println(fila);




        while (!fila.isEmpty()){
            // mostra o primeiro elemento da fila
          //  System.out.println(fila.peek());

            // mostra e remove o primeiro elemento da fila
            // no momento que é retirado algum é ordenado a fila // comparable ou comparator
            System.out.println(fila.poll());

            // Remove por elemento / mas não tem sentido usar isso aqui... Por seguir FIFO e LIFO

            System.out.println(fila.remove());

            


        }





    }
}
