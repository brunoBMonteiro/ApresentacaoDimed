package estruturaDeDados.collections2.test.set;

import estruturaDeDados.collections2.dominio.Manga;
import estruturaDeDados.collections2.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

// se não tiver acesso a Classe smartphone pode
class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getModelo().compareTo(o2.getModelo());
    }
}


// duas formas
// Passando quando se cria o objeto
// Ou diretamente na classe

class MangaPrecoComparator implements  Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
     // Segue as mesmas regras do set, contando aos elemetnso

                                    // classe que implementa a interface
        // são geralmente ligadas por teram o  Sort (Tree)
        // as classes que foram adicionadas ao tree obrigatoriamente tem que ter o comparator
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(smartphone);


        System.out.println(" ---------------------- Manga ----------------------");

        NavigableSet<Manga> manga = new TreeSet<>(new MangaPrecoComparator());
        manga.add(new Manga(5L,"Manga1",2.4,0));
        manga.add(new Manga(6L,"Manga5",2.2,5));
        manga.add(new Manga(4L,"Manga2",2.5,7));
        manga.add(new Manga(2L,"Manga3",2.7,3));
        // não aceita iguais na
        manga.add(new Manga(12L,"Manga3",2.4,3));

 // para ordenaçção é usado o compareTo , o CompareTo esta ordenando pelo nome
        // se ultiliza o treeset quando a classe que esta criando a coleção implementa comparator
        // ou se esta criando um comparator para passar na criação depois
        // toda vez que for inserido um elemento, o treeset vai reordenar baseado no compareTo, ou no comparator
        // se usado o TreeSeet, ele usa o compareTo para verificar se tem elementos iguais, e não o equals.

                                //invert a ordem da lista
                              //.descendingSet()
        for (Manga mangas : manga) {
            System.out.println(mangas);
        }
         // descomsidera os precos iguais e retorna o menor
        Manga youyou = new Manga(2L,"Manga200",2.5,6);
        System.out.println("--------Lower------");
        System.out.println(manga.lower(youyou));

        System.out.println("--------Floor------");
        System.out.println(manga.floor(youyou));

        System.out.println("------- Higher -------");
        System.out.println(manga.higher(youyou));


        System.out.println("------- ceiling -------");
        System.out.println(manga.ceiling(youyou));


        // lower // vai vir o imediatamente o menor  <

        //floor  // <=  mesmo elemento ou o mais abaixo (mais parecido )

        //higher  // vai vir o imediatamente maior

        // ceiling // >=  mesmo elemento ou o mais acima (mais parecido)


        System.out.println("---------------");

        // retirar os elementos da lista

        System.out.println(manga.size());
        // retorna e remove o primeiro da lista
        System.out.println(manga.pollFirst());

        // mostra e remove o ultimo da lista
        System.out.println(manga.pollLast());
        System.out.println(manga.size());


    }
}
