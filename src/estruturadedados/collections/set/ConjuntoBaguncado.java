package estruturadedados.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {


        HashSet conjunto = new HashSet();



        // faz a comverção atomatica

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("String");
        conjunto.add('x');
        conjunto.add(1);


        System.out.println("Tamanho do conjunto :  "+ conjunto.size());

        // add pois são "diferentes"
        conjunto.add("string");

        // não mostra pois são iguais
        conjunto.add("String");

        System.out.println("Tamanho do conjunto :  "+ conjunto.size());


        System.out.println(conjunto.remove("s"));

        System.out.println("Tamanho do conjunto :  "+ conjunto.size());
        System.out.println(conjunto.contains("String"));


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);


        // uniaão de dois conjuntos

       // System.out.println( conjunto.addAll(nums));

        // faz a interceção
        System.out.println(conjunto.retainAll(nums));




    }




}
