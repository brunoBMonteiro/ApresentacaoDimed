package estruturaDeDados.collections2.map;

import estruturaDeDados.collections2.array.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Jack");
        Consumidor consumidor2 = new Consumidor("Ana");

        NavigableMap<Consumidor , Consumidor> map = new TreeMap<>();
                // da mesma forma que o set ordena, este tbm vai pela chave do map



        // funciona
       // map.put("A",consumidor);


        // vai dar class cast exeption por causa  que a Kay consumidor , não tem o metthod comparable
        map.put(consumidor,consumidor);
       // map.put("B","Letra B");
       // map.put("C","Letra C");
       // map.put("R","Letra E");


        for (Map.Entry<Consumidor, Consumidor> stringEntry : map.entrySet()) {
            System.out.println(stringEntry);
        }


    }

}
