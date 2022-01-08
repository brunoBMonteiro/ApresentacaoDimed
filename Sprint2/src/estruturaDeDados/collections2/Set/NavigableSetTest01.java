package estruturaDeDados.collections2.Set;

import estruturaDeDados.collections2.array.dominio.Manga;
import estruturaDeDados.collections2.array.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
// ------------------ SOLID ------------------------------------
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
     // Segue as mesmas regras do set, em relação aos elementos

                                    // classe que implementa a interface

        // são geralmente ligadas por teram o  Sort (Tree)
        // as classes que foram adicionadas ao tree obrigatoriamente tem que ter o comparator

                                                        //Implementar um comparator para saber como
                                                                // ele vai ordenar
                                                        // se não tiver ele vai dar erro pela obrigatoriedade
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

        // <=  mesmo elemento ou o mais abaixo (mais parecido )
        System.out.println("--------Floor------");
        System.out.println(manga.floor(youyou));

        // vai vir o imediatamente maior
        System.out.println("------- Higher -------");
        System.out.println(manga.higher(youyou));

        // >=  mesmo elemento ou o mais acima (mais parecido)
        System.out.println("------- ceiling -------");
        System.out.println(manga.ceiling(youyou));




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
