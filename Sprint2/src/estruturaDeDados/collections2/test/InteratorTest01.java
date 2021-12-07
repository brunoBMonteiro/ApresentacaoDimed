package estruturaDeDados.collections2.test;

import estruturaDeDados.collections2.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest01 {

    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5l,"Manga1",2.4,0));
        mangas.add(new Manga(6l,"Manga5",2.4,5));
        mangas.add(new Manga(4l,"Manga2",2.4,7));
        mangas.add(new Manga(2l,"Manga3",2.4,3));

        // não usar o foreach para remover



        // interentor é q nem operador de caixa verifica se tem alguem na fila, se tiver chama

        /*Iterator<Manga> iterator = mangas.iterator();
        while (iterator.hasNext()){
           Manga manga = iterator.next();
           if (manga.getQuantidade()== 0){
               iterator.remove();
           }
            System.out.println("----------");
            System.out.println(mangas);
        }
        System.out.println("-- lambida --------");
*/


        // manga é so variavel
        mangas.removeIf(manga -> manga.getQuantidade()== 0);

        System.out.println(mangas);




    }
}
