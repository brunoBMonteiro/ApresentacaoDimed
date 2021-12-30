package Coptional;

import java.util.*;

// é Uma Classe que Veio para evitar a maioria do nullPointers
// o intuito é deixar o java mais funcional.


public class OptionalTest01 {
    public static void main(String[] args) {


        //Null Poiter // Não existe
       // String nome = findName("agoba");
       // System.out.println(nome.toUpperCase());


        // Classe    Obj que encapsula outros.
        Optional<String> optional1 = Optional.of("Jose");
        System.out.println(optional1);
        // Quando Sabe que vai retornar null
        // Optional<String> optional2 = Optional.of(null);


        // Quando sabe que é empty
        Optional<String> optional2 = Optional.empty();
        System.out.println(optional2);


        // Quando não se sabe se vai retornar null ou não
        Optional<String> optional3 = Optional.ofNullable(null);
        System.out.println(optional3);


        System.out.println(" ------------------");


        // Vai retornar o obj encontrado
        Optional<String> nameOptional = Optional.ofNullable(findName("ana4"));
        System.out.println(nameOptional);




        // Podemos Fazer Operações com os objetos Optionals.


        System.out.println("--------Lamb-------------");
        // ele pede um Consumer, sendo que so tem o method void não deixando colocar em um println
        // para imprimir ele é preciso
        nameOptional.ifPresent(s -> System.out.println(nameOptional));


        // tipo if else, se tiver ele vai trazer, senao pode mandar uma msg
        String empty = nameOptional.orElse("Não Possui o Resgistro na lista");
        System.out.println(empty);

    }

    //
    // Mas Deveriamos ficar instanciando para criar um optional ?
    // -    Não, temos mais dois jeitos de fazer isso
    //
    public static String findName(String name){
        List<String> list = List.of("jack","ana");

        int i = list.indexOf(name);
        if (i != -1){
            return list.get(i);
        }
        return null;
    }


}
