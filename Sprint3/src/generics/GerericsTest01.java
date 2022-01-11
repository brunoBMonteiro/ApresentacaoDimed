package generics;

import stream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class GerericsTest01 {
    public static void main(String[] args) {

          // Forçando adicionar apenas elementos String
          // assim tornando mais facil
         // mas o java ainda é Type Erasure, ou seja, sem o tipo
        // para manter as versoes anteriores e ter uma compatibilidade melhor
        // caso der erro vai dar Class Cast Exeption

        List/*<String>*/ lista = new ArrayList<>();
        lista.add("Tom");
        lista.add(123L);
        lista.add(new LightNovel("Naruto",3.0));

             // para qualquer obj pq não sabe oq tem na lista



             // assim o java chama o toString
        for (Object o : lista) {


           // problema para manipular

            // assim era antigamente
            // mas o java tinha um problema pois tinha muita gente usando e não poderia quebrar o cod
            // da verção anterior

            // então eles tiverao a ideia de adicionar isso em tempo de compilação


            if(o instanceof String){
                System.out.println(o);
            }
            if(o instanceof Long){
                System.out.println(o);
            }
            if (o instanceof LightNovel){
                LightNovel ln = (LightNovel) o;
                System.out.println(ln);
            }
        }


    }


}
