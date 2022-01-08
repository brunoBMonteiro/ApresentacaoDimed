// Comparable    -- Java - lang
//Comparator  -- ultil
package estruturaDeDados.collections2.array.dominio;

import java.util.Objects;

// caso o java precise ordenar a lista ele ira pegar o implements  comparable que foi definido por min
public class Manga implements Comparable <Manga>{
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(nome,"nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return quantidade == manga.quantidade && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

// ordenar em ponto específico do condigo para outro parameter




    @Override
    public int compareTo(Manga outroManga) {
         // e so pode ordenar pelo Wrappers os tipos primitivos não são possiveis.

        //  quiser trocar quem ordena, vai ser muito ruim
        return this.nome.compareTo(outroManga.getNome());

    }


}
