package comportamento.test;

import comportamento.dominio.Car;
import comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoTest02 {

  private static List<Car> cars = List.of(new Car("green",2011),new Car("black",1981));

                                                             // polimorfismo
    private static List<Car> filterCar(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterByColor = new ArrayList<>();

        for (Car car : cars) {
            // não foi definida o teste aidna vai
            // ser criado uma classe anonima para isso
            if(carPredicate.test(car)){
               filterByColor.add(car);

            }
        }


        return filterByColor;
    }


    public static void main(String[] args) {
List<Car> greenCars = filterCar(cars, new CarPredicate() {
    @Override
    public boolean test(Car car) {

        return car.getColor().equals("green");
    }
});

        System.out.println(greenCars);

        System.out.println("-----lambda-----");
        List<Car> blackCars = filterCar(cars,car -> car.getColor().equals("black"));
        List<Car> greeenCars = filterCar(cars,car -> car.getColor().equals("green"));
        List<Car> carsByYear = filterCar(cars,car -> car.getYear() < 2005);


        System.out.println(blackCars);
        System.out.println(greeenCars);
        System.out.println(carsByYear);




    }



}
