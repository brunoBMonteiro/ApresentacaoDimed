package features.oito.comportamentolambda.predicate.interfaces;
// lambda predicate
import features.oito.comportamentolambda.predicate.dominioa.Car;


// lambdas para elas funconarem obrigatoriamente tem que ter uma interface funcional

// interface funcional é quando se tem apenas um metodo abstrato sem corpo;

// toda interface funcional pode ser usado lambda

// o propio metodo da sua interface funcional diz como a lambda vai se comportar



@FunctionalInterface
public interface CarPredicate {

    // labdas são anonimas
    // são funções porque não são ligadas a nem uma classe

    // Obj é deixar o codigo bem reduzido

    // Contrato da labda
    boolean test(Car car);

    // lambda        // retorna boolean
    // parametro  - >  <Expressao>
    // (Car car) - >  car.getColor().equals("green")


}
