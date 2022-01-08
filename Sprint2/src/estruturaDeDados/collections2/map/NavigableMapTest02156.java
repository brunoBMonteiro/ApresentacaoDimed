package estruturaDeDados.collections2.map;

import estruturaDeDados.collections2.array.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest02156 {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Jack");
        Consumidor consumidor2 = new Consumidor("Ana");

        NavigableMap<String , String> map = new TreeMap<>();




        map.put("A","Letra A");
        map.put("B","Letra B");
        map.put("C","Letra C");
        map.put("R","Letra E");


        for (Map.Entry<String, String> stringEntry : map.entrySet()) {
            System.out.println(stringEntry);
        }



        // ele vai retornar todo mundo acima da letra C
        System.out.println(map.headMap("C"));

        System.out.println(map.headMap("C").remove("A"));

        System.out.println(map);

        // e a maioria das funções do set



    }

}
