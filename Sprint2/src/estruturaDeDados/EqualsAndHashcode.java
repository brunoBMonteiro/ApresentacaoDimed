package estruturaDeDados;



public class EqualsAndHashcode {


    // equals vem junto com o hashcode




    public static void main(String[] args) {

 // comparação de objetos


        // equals é dispoivel em TODOS os objetos em java
        // equals sem modificação é igual ao  " == "


        Produto p1 = new Produto();
          p1.nome="tom";
        Produto p2 = new Produto();
          p2.nome="tom";


        System.out.println("a" == "a");

        // false, pois ele não compara 2 objetos
        // ele compara o endereço de memoria
        System.out.println(p1 == p2);

        // a mesma coisa da de cima.
        System.out.println(p1.equals(p2));


    }





// equals
// compara objeto por objeto mais lento
// retorna True ou false (boolean)




// hashcode

    // retorna um valor inteiro
    // faz comparação dinamica
    // compara primeiramente a quantidade de caracteres apos faz a comparação de de objeto sendo mais rapida.








}
