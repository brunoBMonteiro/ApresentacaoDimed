package criacionais.factorymethod.fruit.Factory;

import criacionais.factorymethod.fruit.fruits.Apple;
import criacionais.factorymethod.fruit.fruits.Banana;
import criacionais.factorymethod.fruit.fruits.Fruit;
import criacionais.factorymethod.fruit.fruits.Orange;

public class FruitFactory {
     public Fruit getFruit(String name) {
        switch (name) {
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            case "banana":
                return new Banana();
        }
        throw new RuntimeException("No matching object could be created");
    }
}