package features.aOito.comportamentoLambda.test;

import features.aOito.comportamentoLambda.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoTest02 {

  private static List<Car> cars = List.of(new Car("green",2011),new Car("black",1981));

                                                             // polimorfismo
    private static List<Car> filterCar(List<Car> cars, Predicate<Car> carPredicate){
        List<Car> filterByColor = new ArrayList<>();

        for (Car car : cars) {
            // não foi definida o teste aidna vai
            // ser criado uma classe anonima para isso
            if(carPredicate.test(car)){
               filterByColor.add(car);

            }
        }

        //

        return filterByColor;
    }


    public static void main(String[] args) {
        // classe anonima

/*List<Car> greenCars = filterCar(cars, new CarPredicate() {
    @Override
    public boolean test(Car car) {

        return car.getColor().equals("green");
    }
});*/



        System.out.println("-----lambda-----");
        // faz os metodos de seleção de carro, por lambda, preto, verde e por ano.
                                              // pode ser usado assin tbm
        List<Car> blackCars = filterCar(cars,(Car car) -> car.getColor().equals("black"));
        List<Car> greeenCars = filterCar(cars,car -> car.getColor().equals("green"));
        List<Car> carsByYear = filterCar(cars,car -> car.getYear() < 2005);

        System.out.println(blackCars);
        System.out.println(greeenCars);
        System.out.println(carsByYear);






    }



}
