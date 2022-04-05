package estrutural.composite.caminhao;

public class CaminhoApplication {
    public static void main(String... args){
        Trecho trecho1 = new TrechoAndando("Vá até o cruzamento da Av . Rebouças com a Av . Brigadeiro Faria Lima ", 1000D);
        Trecho trecho2 = new TrechoDeCarro("Vá até o cruzamento da Av . Brigadeiro Faria Lima com a Av . Cidade Jardim ", 2500D);
        Trecho trecho3 = new TrechoDeCarro("Vire a direita na Marginal Pinheiros " , 500D);

        Caminho caminho1 = new Caminho();
        caminho1.adiciona(trecho1);
        caminho1.adiciona(trecho2);
        System.out.println("Caminho 1: ");
        caminho1.imprime();

        Caminho caminho2 = new Caminho();
        caminho2.adiciona(caminho1);
        caminho2.adiciona(trecho3);
        System.out.println("\n ------------ \n");
        System.out.println("Caminho 2: ");
        caminho2.imprime();
    }
}