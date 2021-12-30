package features.bNove;


/*Métodos de fábrica para coleta
Os métodos de fábrica são tipos especiais de métodos estáticos usados
 para criar instâncias não modificáveis de coleções. Isso significa
 que podemos usar esses métodos para criar lista, conjunto e mapa de um pequeno número de elementos.

Ele não pode ser modificado, portanto, a adição de um novo elemento lançará
 java.lang.UnsupportedOperationException
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

    public static void main(String[] args) {

        List <String> list =  new  ArrayList <> ();
        list.add ( "Java" );
        list.add ( "JavaFX" );
        list.add ( "Primavera" );
        list.add ( "Hibernate" );
        list.add ( "JSP" );
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(names);
    }
     // é usado em collection
    //Ele retorna uma lista imutável



    private static Set<String> set = Set.of ( "Java" , "JavaFX" , "Spring" , "Hibernate" , "JSP" );
    private static List<String> names =  List.of ( "Java" , "JavaFX" , "Spring" , "Hibernate" , "JSP" );
    private static Map <Integer, String> map = Map.of ( 101 , "JavaFX" , 102 , "Hibernate" , 103 , "Spring MVC" );
    private static List<Integer> numeros = List.of(3);

}
