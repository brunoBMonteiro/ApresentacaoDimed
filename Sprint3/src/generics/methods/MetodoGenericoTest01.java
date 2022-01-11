package generics.methods;

import generics.dominio.Barco;
import generics.dominio.Carro;

public class MetodoGenericoTest01 {

    public static void main(String[] args) {

        new DoisAtributtos<Carro, Barco>(new Carro("Uno"),new Barco("Canoa"));

    }

//quando se trabalha com generics pode se colocar quantos atributos quiser

    static class DoisAtributtos<T,R>{
        private T t;
        private R r;


        public DoisAtributtos(T t, R r) {
            this.t = t;
            this.r = r;
        }
    }


}
