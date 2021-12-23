package features.jDezesete.swicht;

import features.iDezesseis.instanceoff.Cat;

public class PrevSwichtObjs {



    public static String test(Object obj) {


        return switch(obj) {

            case Integer i -> "An integer";

            case String s -> "A string";

            case Cat c -> "A Cat";

            default -> "I don't know what it is";

        };

    }



    public static void main(String[] args) {

        Cat cat = new Cat("javk");

        test(cat);




    }

}

