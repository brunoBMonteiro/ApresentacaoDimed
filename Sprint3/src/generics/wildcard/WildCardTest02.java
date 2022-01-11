package generics.wildcard;


import java.util.List;

public class WildCardTest02 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(),new Cachorro());
        List<Gato> gato = List.of(new Gato(),new Gato());
        printConsulta(cachorros);



    }

      // o java depois que compila que não sabe que Cachorro é uma animal por causa do type Erasure
                                       // assim tem que passar exatamente o que foi definido aqui
    // Assim temos o WildCard == > ?
                                       // neste metodo quero aceitar qualquer tipo de animal
    // mas fazendo isso perco o direito de adicionar elementos na lista

    // pq ela aceitaria todos esses objetos assim dando problema
    // Animal cachorro = new Cachorro();
    // Gato cachorro = new Cachorro();
    // Cachorro cachorro = new Gato();
    // Cachorro cachorro = new Cachorro();

    // por isso se perde o direito de adicionar ai.

                                               //Animal e qualquer um que seja filho
                                              // usado em interfaces tbm // n se usa implements neste caso
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal1 : animals) {
            animal1.consulta();
        }

        //List<Gato> gato = List.of(new Gato(),new Gato());
        //gato.add(new Gato());
    }

                                      //Animal e qualquer um que seja pai
                                      // aqui tem a garantia do polimorfismo
                                      // assim podendo adicionar
    private static void printConsultaAnimal(List <? super Animal> animals){
             animals.add(new Cachorro());
             animals.add(new Gato());


    }


}
