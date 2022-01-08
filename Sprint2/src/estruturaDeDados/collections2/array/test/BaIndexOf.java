package estruturaDeDados.collections2.array.test;

import estruturaDeDados.collections2.array.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class BaIndexOf {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("s1","Samsung");
        Smartphone s25 = new Smartphone("s244","Sams4ung");
        Smartphone s3 = new Smartphone("s3","Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
       // smartphones.add(s2);
        smartphones.add(s3);


        for (Smartphone smartphone: smartphones ) {
            System.out.println(smartphone);
        }

  // verifica se tem na lista (Contains)    -----------------------
        System.out.println(smartphones.contains(s3));









        // Na lista a varios methodos implementados, um muito util é o indexOf
    // indexof  vai trazer o index do objeto que está passando
        //se for -1 Ele não existi

      int indexSmartphones =  smartphones.indexOf(s25);
        System.out.println(indexSmartphones);


        // retorna o objeto encontrado
        System.out.println(smartphones.get(indexSmartphones));


    }
}
