package estruturaDeDados.collections2.test.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {


    public static void main(String[] args) {

        // não é uma collection, não faz parte da linha de herança
        //  é uma interface separada
        //  Tem que ter o Equals e Hash code
        // mão pode ter chaves duplicadas

        // Corretor de palavras

        // para mantar a ordem de inserção é so colocar o

        Map <String, String> map = new LinkedHashMap<>();

    map.put("Tekado" , "Teclado");
    map.put("mousi", "mouse");
    map.put("vc","voçê");

    // ele vai subistituir o valor
        map.put("vc","voçê2");
// pode ter valores iguais, mas não chaves
        map.put("vc2","voçê2");

          // so vai adicionar caso não exista
       map.putIfAbsent("vc","voçê2");

        System.out.println(map);




// navegar pelo valores

        // via chave e via valor

        // é um Set<String>, sendo assim não pode ter duplicado
        map.keySet();

        // são os valores
        // pode ter valores duplicados
        map.values();


        // pegar pela chaves,  vai ter todas as chaves
        for (String key : map.keySet()) {
            System.out.println(key + " < ---- ESQ   DIR -------> " + map.get(key));
        }

        for (String value : map.values()) {

            System.out.println(value);
        }

        System.out.println(" ---------entry ---------- ");
        // é um objeto que vai ter a chave e o valor

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);


        }


    }

}
