package features.aOito.comportamentoLambda.aPredicate.test;

import features.aOito.comportamentoLambda.aPredicate.dominioa.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoTest03 {

    private static List<Car> cars = List.of(new Car("green",2011),new Car("black",1981));

    // polimorfismo
    private static List<Car> filterCars(List<Car> cars, Predicate<Car> carPredicate){
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
/*List<Car> greenCars = filterCar(cars, new CarPredicate() {
    @Override
    public boolean test(Car car) {

        return car.getColor().equals("green");
    }
});*/



        System.out.println("-----lambda-----");
        // faz os metodos de seleção de carro, por lambda, preto, verde e por ano.
        List<Car> blackCars = filterCar(cars, car -> car.getColor().equals("black"));
        List<Car> greeenCars = filterCar(cars,car -> car.getColor().equals("green"));
        List<Car> carsByYear = filterCar(cars,car -> car.getYear() < 2005);

        System.out.println(blackCars);
        System.out.println(greeenCars);
        System.out.println(carsByYear);


   List<Integer> nums = List.of(1,2,3,4,5,6,7,9);

        System.out.println(filterCar(nums,a-> a % 2 ==0));



    }

 // metodo generico
    private static <T> List <T> filterCar (List<T> list, Predicate<T> predicate){

        List<T> filteredList = new ArrayList<>();

        for (T e : list){

            if(predicate.test(e)){
                filteredList.add(e);

            }

        }
        return filteredList;



    }



}