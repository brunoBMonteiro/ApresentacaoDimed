package criacionais.buildere.pizzabuilder.pizza;



public class Pizza {
    private final Crust crust;
    private final Sauce sauce;
    private final Size size;
    private final boolean extraCheese;
    private final boolean jalapeno;
    private final boolean pepper;
    private final boolean corn;
    private final boolean tomato;
    private final boolean peperoni;
    private final boolean pineapple;
    private final boolean seasoning;



    public Pizza(Size size, Crust crust, Sauce sauce, boolean extraCheese, boolean jalapeno,
                 boolean pepper, boolean corn, boolean tomato, boolean peperoni, boolean pineapple, boolean seasoning) {

        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.extraCheese = extraCheese;
        this.jalapeno = jalapeno;
        this.pepper = pepper;
        this.corn = corn;
        this.tomato = tomato;
        this.peperoni = peperoni;
        this.pineapple = pineapple;
        this.seasoning= seasoning;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "crust=" + crust +
                ", sauce=" + sauce +
                ", size=" + size +
                ", extraCheese=" + extraCheese +
                ", jalapeno=" + jalapeno +
                ", pepper=" + pepper +
                ", corn=" + corn +
                ", tomato=" + tomato +
                ", peperoni=" + peperoni +
                ", pineapple=" + pineapple +
                ", seasoning=" + seasoning +
                '}';
    }
}




