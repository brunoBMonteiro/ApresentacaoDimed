package ZnotApresetation.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    // a fazer ...

    String nome;
    List<Compra> compras = new ArrayList<Compra>();


    Cliente (String nome){
        this.nome =nome;
    }





double obterValorotal(){

    double total=0;

    for (Compra compra: compras ) {
        total += compra.obterValortotal();


    }
return  total;
}




}
