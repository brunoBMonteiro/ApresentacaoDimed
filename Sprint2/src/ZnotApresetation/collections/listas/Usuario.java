package ZnotApresetation.collections.listas;

import java.util.Objects;

public class Usuario {
    String nome;
    String id;


    public Usuario(String id) {
        this.id = id;
    }


    public Usuario(String id,String nome) {
        this.id = id;
        this.nome = nome;

    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
