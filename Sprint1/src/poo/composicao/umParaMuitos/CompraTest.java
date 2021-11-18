package poo.composicao.umParaMuitos;

public class CompraTest {
    public static void main(String[] args) {
        Compra c1 = new Compra();

        c1.cliente = "Joao";
        c1.itens.add(new Item("Caneta",3,10.0));
        c1.itens.add(new Item("Borracha",5,50.0));
        c1.itens.add(new Item("Celular",10,20.0));

      //  System.out.println(c1.itens.resize());
        System.out.println(c1.obtervalorTotal());

    }
}
