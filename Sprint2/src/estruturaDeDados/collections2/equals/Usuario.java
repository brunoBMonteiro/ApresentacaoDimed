package estruturaDeDados.collections2.equals;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;


    public Usuario(String nome, String email) {
      this.nome = nome;
        this.email = email;
    }

    public Usuario(String nome) {
        this.nome = nome;
       }



// regras para implementar o equals

// Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null

// simetrico para x e y diferneted de null se x.equals(y) == true logo y.equals(x)  == true

// Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true

// Consistente: x.equals(x) sempre retorna true se x for diferente de null

// para x diferente de null, x.equals(null) tes que retornar false.





// tem que ver qual o campo que quer comparar para se "Tornar iguais"

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }




    // hashcode
    // retorna um valor inteiro
    // faz comparação dinamica
    // compara primeiramente a quantidade de caracteres apos faz a comparação de objeto sendo mais rapida.
    //Generates a hash code for a sequence of input values.
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }



}
