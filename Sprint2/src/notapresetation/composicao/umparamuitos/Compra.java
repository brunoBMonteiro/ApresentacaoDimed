package notapresetation.composicao.umparamuitos;

import java.util.ArrayList;

public class Compra {
          // tipo item
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    double obtervalorTotal(){
        double total = 0;
        for (Item item : itens ) {
            total+=item.qtd * item.preco;
        }

        return total;
    }




}
