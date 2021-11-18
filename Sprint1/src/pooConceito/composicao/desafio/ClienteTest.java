package pooConceito.composicao.desafio;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Rafa");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Celular",200,5);
        compra1.adicionarItem(new Produto("notebook",3000.0),3);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno",200,5);
        compra2.adicionarItem(new Produto("caneta",3000.0),3);
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorotal());

    }


}
