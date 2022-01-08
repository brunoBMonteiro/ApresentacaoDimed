package features.oito.comportamentolambda.predicate.test.behaviorParametrazation;

import features.oito.comportamentolambda.predicate.dominioa.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoTest01 {

  private static List<Car> cars = List.of(new Car("green",2011),new Car("black",1981));



    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterBlackCar(List<Car> cars){
        List<Car> blackCars = new ArrayList<>();

        for (Car car : cars) {

            if (car.getColor().equals("black")){
                blackCars.add(car);
            }
        }
        return blackCars;
    }

    private static List<Car> filterCarbyColor(List<Car> cars,String color){
        List<Car> filterByColor = new ArrayList<>();

        for (Car car : cars) {

            if (car.getColor().equals(color)){
                filterByColor.add(car);
            }
        }
        return filterByColor;
    }

    private static List<Car> filterCarbyYear(List<Car> cars,int year){
        List<Car> filteredCarByYear = new ArrayList<>();

        for (Car car : cars) {

            if (car.getYear() < year){
                filteredCarByYear.add(car);
            }
        }
        return filteredCarByYear;
    }



    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterBlackCar(cars));
        System.out.println("---------------");
        System.out.println(filterCarbyColor(cars,"green"));
        System.out.println(filterCarbyColor(cars,"black"));
        System.out.println("-----------------");
        System.out.println(filterCarbyYear(cars,2010));



    }



}
