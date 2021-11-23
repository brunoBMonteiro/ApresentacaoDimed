package estruturadedados.hash;


import estruturadedados.collections.listas.Usuario;

import java.util.HashSet;

public class hash {
    public static void main(String[] args) {



        HashSet<Usuario> usuario = new HashSet<>();

        usuario.add(new Usuario("Pedro"));
        usuario.add(new Usuario("Rafaela"));
        usuario.add(new Usuario("Tom"));

        boolean resultado = usuario.contains(new Usuario("Tom"));
        System.out.println(resultado);




    }
}
