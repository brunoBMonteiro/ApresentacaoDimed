package estruturadedados.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
         // obrigatoriamente é do tipo string
       // Set<String> lista = new HashSet<>();

             // generics         //retorna os conjuntos ordenados
               //<Generics>
        SortedSet<String> lista = new TreeSet<>();

        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");

        // não é possivel pois não é suportado pelo SET
       // lista.get("ana");
        for (String candidato: lista) {
            System.out.println(candidato);
        }

    }
}
