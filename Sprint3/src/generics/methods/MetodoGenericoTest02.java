package generics.methods;

import generics.dominio.Barco;
import generics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest02 {
    public static void main(String[] args) {


        criarArrayComUmObj(new Barco("Canoa"));



        List<Carro> carros = criarArrayComUmObjComRetoro(new Carro("Ferrari"));
        System.out.println(carros);


    }
         // primeiramente o tipo            // apos assinatura generica
              private static<T> void criarArrayComUmObj(T t){
                  List<T> list = List.of(t);
                  System.out.println(list);

              }

    // primeiramente o tipo    //retorno                          // apos assinatura generica
    private static<T>          List<T> criarArrayComUmObjComRetoro(T t){
        return List.of(t);

    }




}
