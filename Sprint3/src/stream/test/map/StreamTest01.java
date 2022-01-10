package stream.test.map;
/*
* Stream é uma forma de processamento de dados
* Streams ajuda a fazer as funcionalidades de uma coleção de uma forma mais funcional/ declarativa
* Ex: Banco de dados   geramente processo de dados (buscar por nome, retornar apenas com a primeira objetos apenas com a primeira letra
* // antigamente era mais complicado fazer isso no java
*
* Stream é uma coleção de elementos  - dados no tempo está guardando a sequencia e não esta guardando nada ,
* Collections elementos em um espaço - dados em Espaço  - guarda na memoria
*
*
*
* */



import stream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Ordenar Light novel por titulo
// retrive the first 3 light nobel with price less tha 4
public class StreamTest01 {

    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("narutao",1.5),
            new LightNovel("Sword Art Online",7.6),
            new LightNovel("no game no life",2.5),
            new LightNovel("spell",1.5),
            new LightNovel("fairy",2.5),
            new LightNovel("Liga dos Campeoes ",2.5)
            ));


// antes de stream

    public static void main(String[] args) {
        list.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> nomesTitle = new ArrayList<>();
        for (LightNovel listNovel : list) {
            if (listNovel.getPrice() <= 4){
                  nomesTitle.add(listNovel.getTitle());
            }
            if (nomesTitle.size() >= 3){
                break;
            }
            System.out.println(listNovel);
        }
        System.out.println(nomesTitle);
    }





}
