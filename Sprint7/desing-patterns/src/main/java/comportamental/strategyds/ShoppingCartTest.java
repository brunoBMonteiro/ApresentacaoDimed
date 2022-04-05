package comportamental.strategyds;

import comportamental.strategyds.strategy.CreditCardStrategy;
import comportamental.strategyds.strategy.PaypalStrategy;
import comportamental.strategyds.vault.Item;
import comportamental.strategyds.vault.ShoppingCart;

import java.util.Collections;
import java.util.Comparator;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);


        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));



        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
