package estruturaDeDados.equals;

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





// Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null // Simétrico: para xe y diferentes de null, se x.equals(y) = true logo, y.equals(x) == true

// simetrico para x e y diferneted de null se x.equals(y) == true kigi y.equals(x)  == true

// Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == to

// Consistente: x.equals(x) sempre retorna true se x for diferente de null

// para x diferente de null, x.equals(null) tes que retornar false.

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




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    // mais futuramente

}
