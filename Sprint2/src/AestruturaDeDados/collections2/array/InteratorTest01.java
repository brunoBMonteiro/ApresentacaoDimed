package AestruturaDeDados.collections2.array;

import AestruturaDeDados.collections2.array.dominio.Manga;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InteratorTest01 {
 // e uma classe q cheacar antes de fazer a ação
    public static void main(String[] args) {


                                // neste caso o linked é melhor que o ArrayList, pois no BigO ele esta com um desempenho mellhor para isto.
        List<Manga> mangas = new LinkedList<>();

        mangas.add(new Manga(5l,"Manga1",2.4,0));
        mangas.add(new Manga(6l,"Manga5",2.4,5));
        mangas.add(new Manga(4l,"Manga2",2.4,7));
        mangas.add(new Manga(2l,"Manga3",2.4,3));

        // não usar o foreach para remover
       // if (manga.getQuantidade()== 0){

        // interentor é q nem operador de caixa,  verifica se tem alguem na fila, se tiver chama e faz as operações

        // roda sobre a lista e faz a condição    que é remover os que tem valor = 0
        //
        Iterator<Manga> iterator = mangas.iterator();
       // enqunto ainda tiver continua executando

        while (iterator.hasNext()){
           Manga manga = iterator.next();
           if (manga.getQuantidade()== 0){
               iterator.remove();
           }
        }
        System.out.println("----------");
        System.out.println(mangas);


        System.out.println("-- lambda --------");

         // mas com as classes funcionais pode se usar assim
        mangas.removeIf(manga -> manga.getQuantidade()== 0);

        System.out.println(mangas);




    }
}
