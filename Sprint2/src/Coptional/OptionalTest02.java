package Coptional;

import java.util.List;
import java.util.Optional;


public class OptionalTest02 {


// não é uma Boa
    //  Pq, a classe optional não é uma classe serializable
    Optional<String> name ;


    public static void main(String[] args) {



        System.out.println(" ------------------");

        Optional<String> nameOptional = (findName(Optional.of("ana")));
        System.out.println(nameOptional);



        System.out.println("--------Lamb-------------");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));


    }

// Modificação  < ------------- Retorno Metthod, Empty, ou valor
                                                // isso não é indicado, assim como os atributos
    public static Optional<String> findName(Optional<String> name){
                                // cria uma lista immutavel
        List<String> list = List.of("jack","ana");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }

}
