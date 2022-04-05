package criacionais.buildere.pizzabuilder.builder;

import criacionais.buildere.pizzabuilder.pizza.Crust;
import criacionais.buildere.pizzabuilder.pizza.Pizza;
import criacionais.buildere.pizzabuilder.pizza.Sauce;
import criacionais.buildere.pizzabuilder.pizza.Size;

public interface PizzaBuilder {
    PizzaBuilder withCrust(Crust crust);
    PizzaBuilder withSauce(Sauce sauce);
    PizzaBuilder ofSize(Size size);
    Pizza build();
}