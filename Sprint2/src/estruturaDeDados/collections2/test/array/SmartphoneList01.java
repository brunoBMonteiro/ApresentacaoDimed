package estruturaDeDados.collections2.test.array;

import estruturaDeDados.collections2.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneList01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("s1","Samsung");
        Smartphone s2 = new Smartphone("s2","Samsung");
        Smartphone s3 = new Smartphone("s3","Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone: smartphones ) {
            System.out.println(smartphone);
        }

    // indexof  vai trazer o index do objeto que está passando  -1 se não existir

        System.out.println(smartphones.contains(s3));

      int indexSmartphones =  smartphones.indexOf(s2);


        System.out.println(indexSmartphones);
        System.out.println(smartphones.get(indexSmartphones));


    }
}
