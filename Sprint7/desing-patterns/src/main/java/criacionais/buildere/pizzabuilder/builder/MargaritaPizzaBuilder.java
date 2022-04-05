package criacionais.buildere.pizzabuilder.builder;

import criacionais.buildere.pizzabuilder.pizza.Crust;
import criacionais.buildere.pizzabuilder.pizza.Pizza;
import criacionais.buildere.pizzabuilder.pizza.Sauce;
import criacionais.buildere.pizzabuilder.pizza.Size;

public class MargaritaPizzaBuilder implements PizzaBuilder {

    private Crust crust = Crust.HAND_TOSSED;
    private Sauce sauce = Sauce.TOMATO;
    private Size size = Size.BIG;

    @Override
    public PizzaBuilder withCrust(Crust crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder withSauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder ofSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, crust, sauce, true, false, false, false, false, false, false, true);
    }




}