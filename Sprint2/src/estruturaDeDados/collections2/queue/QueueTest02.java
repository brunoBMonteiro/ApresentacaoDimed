package estruturaDeDados.collections2.queue;

import estruturaDeDados.collections2.array.dominio.Consumidor;
import estruturaDeDados.collections2.array.dominio.Manga;



import java.util.*;


class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}


public class QueueTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Jack");


        // não funciona pois precisa de um comparable
                                               // ele pode definir a prioridade
                                               // assim add e removendo o primeiro da lista com a prioridade definida
        // manga = nome
// do menor para o maio
//
// revert a ordenação, agora esta do maior para o menor
        Queue<Manga> manga = new PriorityQueue<>(new MangaPrecoComparator().reversed());


        manga.add(new Manga(5L,"Manga1",2.4,0));
        manga.add(new Manga(6L,"Manga5",2.2,5));
        manga.add(new Manga(4L,"Manga2",2.5,7));
        manga.add(new Manga(2L,"Manga3",2.7,3));


while (!manga.isEmpty()){
    System.out.println(manga.poll());


}




    }
}
