package AestruturaDeDados.collections2.array.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {

    private Long id;
    private String nome;


    public Consumidor(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
