package features.aOito.comportamentoLambda.interfaces;
// lambda predicate
import features.aOito.comportamentoLambda.dominio.Car;
// como é feito uma criação de classe Predicate
// mas ja tem nativo no java

// lambdas para elas funconarem obrigatoriamente tem que ter uma interface funcional
// interface funcional é quando se tem apenas um metodo abstrato sem corpo;
// toda interface funcional pode ser usado lambda
// o propio metodo da sua interface funcional diz como a lambda vai se comportar



@FunctionalInterface
public interface CarPredicate {

    // labdas são anonimas
    // são funções porque não são ligadas a nem uma classe
    // tem por objetivo deixar o codigo mais consciso (Reduzir o codigo ao essencial apenas, menor  )
    boolean test(Car car);

    // lambda        // retorna boolean
    // parametro  - >  <Expressao>
    // (Car car) - >  car.getColor().equals("green")


}
