package estruturaDeDados.collections.map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        java.util.Map<String,String> usuarios = new HashMap<String,String>();
         // Faz duas coisas

        // Adiciona senão existir
        // e substitui caso já exista
        usuarios.put("3","Roberto");
        // altera
        usuarios.put("2","Rafaela");
usuarios.entrySet();
        //------------------

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

// pega o conjunto da chave  [1,2,3] // e não é ordenado  // tabela a esqueda  [-> 1 ,roberto]
        System.out.println(usuarios.keySet());

        // mostra apenas o os valores da direita  [1 , - >  roberto]
        System.out.println(usuarios.values());

// pega os elemento pelo valor

        System.out.println(usuarios.get(1));


        // percorrer elementos pelo map
// esquerda
        for (String chave: usuarios.keySet() ) {
            System.out.println(chave);
        }
// direita
        for (String chave: usuarios.values() ) {
            System.out.println(chave);
        }

        // os dois juntos

        System.out.println("------------------------");
for(java.util.Map.Entry<String,String> registros: usuarios.entrySet() ){
    System.out.println(registros.getKey()+" ");
    System.out.println(registros.getValue());

}








    }
}
