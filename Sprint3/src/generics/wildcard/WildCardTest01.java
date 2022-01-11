package generics.wildcard;


abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Dog no medico");
    }
}

class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Cat no medico");
    }
}

// esse codigo funciona pois o java internamente ja sabe os tipos, no caso do vector,
// e dos metodos genericos que,




public class WildCardTest01 {

    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
        Gato[] gato = {new Gato(),new Gato()};
        printConsulta(cachorros);
        printConsulta(gato);
        System.out.println("Animals ");
        Animal[] animals  = {new Cachorro(),new Gato()};
        printConsulta(animals);

    }
// este metodo trabalha dife

    private static void printConsulta(Animal[] animal){
        for (Animal animal1 : animal) {

            animal1.consulta();
        }

        // aqui começa o problema
        // pois foi adicionado na primeira interação um array de dog
        // aqui tenta adiconar um gato no lugar
        //animal[1] = new Gato();
        // se fosse um array de animais ai poderia fazer
        // pois é o mesmo equivalente a Animais animais = new Gato;
        // e isso funciona bem nos arrays
        // agora nas listass



    }


}
