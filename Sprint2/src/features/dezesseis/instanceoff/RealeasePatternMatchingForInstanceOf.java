package features.dezesseis.instanceoff;

public class RealeasePatternMatchingForInstanceOf {
    public static void main(String[] args) {

        Animal animal = new Animal("Tom");
        Cat cat1 = new Cat("bixano");
        Dog dog1 = new Dog("perigo");


animal = dog1;


//Traditional instanceOf Operator

            // verifica de Cat ou dog é uma isntancia de animal
        if (animal instanceof Cat) {
            // sendo true, pode fazer o cast de Animal, para cat
            Cat animal1= (Cat) animal;
            animal1.meow();

            // other cat operations
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.woof();
            // other dog operations
        }

// Pattern Matching for instanceof in Java 14

        if (animal instanceof Cat cat) {
            cat.meow();
        } else if(animal instanceof Dog dog) {
            dog.woof();
        }



    }
}
