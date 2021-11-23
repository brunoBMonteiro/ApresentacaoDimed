package estruturadedados.collections.listas;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {


        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        // é um jeito
        Usuario u1 = new Usuario("1","Ana");
        lista.add(u1);

        // tbm pode ser assim    // so é permitido usar quando se tem o equals e o hashcode
       // lista.add(new Usuario("2","Carlos"));
       // lista.add(new Usuario("3","Joao"));

        //System.out.println(lista.remove(0));
        // remover

      // lista.remove(0);
    //    System.out.println(   lista.remove(new Usuario("2")));
        // lista.remove(new Usuario("3","Carlos"));
       // lista.remove(new Usuario());

// contains


       System.out.println( lista.contains(new Usuario("Joao")));

        System.out.println( ">>>>>>>>"+lista.contains(u1));


        for (Usuario u: lista ) {
            System.out.println(u.nome);

        }


      //  System.out.println(lista.get(1).nome);





    }
}
