package criacionais.buildere.pizzabuilder;

import criacionais.buildere.pizzabuilder.builder.MargaritaPizzaBuilder;
import criacionais.buildere.pizzabuilder.builder.PepperoniPizzaBuilder;
import criacionais.buildere.pizzabuilder.pizza.Crust;
import criacionais.buildere.pizzabuilder.pizza.Pizza;
import criacionais.buildere.pizzabuilder.pizza.Sauce;
import criacionais.buildere.pizzabuilder.pizza.Size;

public class BuilderPatternTest {
    public static void main(String[] args) {
        //this main class acts as the pizza director
        Pizza bigMargarita = new MargaritaPizzaBuilder()
                .withCrust(Crust.HAND_TOSSED)
                .ofSize(Size.BIG)
                .withSauce(Sauce.TOMATO)
                .build();


        System.out.println(bigMargarita);

   Pizza bigPepperoni = new PepperoniPizzaBuilder()
                .withCrust(Crust.HAND_TOSSED)
                .ofSize(Size.BIG)
                .withSauce(Sauce.TOMATO)
                .build();
        System.out.println(bigPepperoni);

    }
}
