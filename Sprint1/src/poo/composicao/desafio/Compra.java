package poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> item = new ArrayList<Item>();


    void adicionarItem(Produto p, int quantidade){
        this.item.add(new Item(p,quantidade));

    }





    void adicionarItem(String nome, double preco,int quantidade){
               this.item.add(new Item(new Produto(nome,preco),quantidade));
             }

             double obterValortotal(){
                    double total=0;


                    for (Item item: item) {
                     total += item.quantidade * item.produto.preco;
                 }


         return total;

             }


}
