package estruturaDeDados.hash;



import estruturaDeDados.collections.listas.Usuario;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {



        HashSet<Usuario> usuario = new HashSet<>();

        usuario.add(new Usuario("Pedro"));
        usuario.add(new Usuario("Rafaela"));
        usuario.add(new Usuario("Tom"));

        boolean resultado = usuario.contains(new Usuario("Tom"));
        System.out.println(resultado);




    }
}
