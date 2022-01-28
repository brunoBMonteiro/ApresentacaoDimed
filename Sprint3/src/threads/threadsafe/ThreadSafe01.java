package threads.threadsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Treadsafe - pode ter varias threads usando o mesmo recurso
class ThreadSafeNames {
    // lista threadSafe
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add(String name) {
        names.add(name);
    }

    // mas este metodo não é threadSafe
    public synchronized void removeFirst() {
        if (names.size() > 0) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}


public class ThreadSafe01 {
    public static void main(String[] args) {
        // ThreadSafe - a Casse tem os metodos sincronizados thread safe", ou seja, pode ser manipulado por várias tarefas simultaneamente.
        // tem que ter cuidado para que o que está sendo feito Tabem é Thread Safe

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junkrat");

        Runnable r = threadSafeNames::removeFirst;

        new Thread(r).start();
        new Thread(r).start();

// Não Adianta ter uma classe ThreadSafe,
// se mais acima ou seja os metodos que a implementan não são.


    }

}
