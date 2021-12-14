package optional;

import estruturaDeDados.ArrayConceito;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// o que é ?
// foi introduzina na classe 8 do java
// tentar evitar a maioria dos nullPointes Exeptions
// ou seja ser facil identificar que o retorno do metodo
// pode ser optional , ou seja não vir , inves de retornar null
// vai ser um optional
// o intuito é deixar o java mais funcional.
public class OptionalTest01 {
    public static void main(String[] args) {

        //String nome = findName("jack");
        //System.out.println(nome.toUpperCase());

        // optional é um objeto que vai encapsular outros objetos
        // como pode ser criado
        Optional<String> optional1 = Optional.of("Jose");
        // caso não passe um valor //requireNonNull
        // ------------ Optional<String> optional2 = Optional.of(null);
        // caso não saiba se vai ser nullo ou não
        // retornando empty
        //vai criar um optional vazio
        Optional<String> optional3 = Optional.empty();
        Optional<String> optional4 = Optional.ofNullable(null);
        System.out.println(optional1);
        System.out.println(optional3);
        System.out.println(optional4);

        System.out.println(" ------------------");
        // vai retornar (empty),  e não Nullpointer
        Optional<String> nameOptional = Optional.ofNullable(findName("ana"));
        System.out.println(nameOptional);

        System.out.println("--------Lamb-------------");
        // ele pede um Consumer, sendo que so tem o method void não deixando colocar em um println
        // para imprimir ele é preciso
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));




        // tipo if else, se tiver ele vai trazer, senao pode mandar uma msg
        String empty = nameOptional.orElse("Outra mensagem");
        System.out.println(empty);



    }


    public static String findName(String name){
                                // cria uma lista immutavel
                              // java 9
        List<String> list = List.of("jack","ana");
        int i = list.indexOf(name);
        if (i != -1){
            return list.get(i);
        }
        return null;
    }


    boolean getNumbersBiggerThanZero(List<Integer> numbers) {
        numbers.add(1);
        return numbers.stream()
                .allMatch(number -> number > 0);
    }

}
