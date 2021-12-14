package comportamento.test;

import comportamento.dominio.Car;

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

    public static void main(String[] args) {


        System.out.println(filterGreenCar(cars));





    }



}
