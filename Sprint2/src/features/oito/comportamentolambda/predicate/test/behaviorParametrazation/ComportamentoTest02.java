package features.oito.comportamentolambda.predicate.test.behaviorParametrazation;

import features.oito.comportamentolambda.predicate.dominioa.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoTest02 {

  private static List<Car> cars = List.of(new Car("green",2011),new Car("black",1981));


                                                             // polimorfismo
    private static List<Car> filterCar(List<Car> cars, Predicate<Car> carPredicate){
        List<Car> filterByColor = new ArrayList<>();

        for (Car car : cars) {
            if(carPredicate.test(car)){
               filterByColor.add(car);

            }
        }

        //

        return filterByColor;
    }


    public static void main(String[] args) {


        System.out.println("-----lambda-----");
                                      //lista //classe // variavel
        List<Car> blackCars = filterCar(cars,(Car car) -> car.getColor().equals("black"));
                                            // simplificado
        List<Car> greeenCars = filterCar(cars,car -> car.getColor().equals("green"));
        List<Car> carsByYear = filterCar(cars,car -> car.getYear() < 2005);

        System.out.println(blackCars);
        System.out.println(greeenCars);
        System.out.println(carsByYear);






    }



}
