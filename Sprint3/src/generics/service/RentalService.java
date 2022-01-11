package generics.service;

import generics.dominio.Carro;

import java.util.List;

public class RentalService<T> {

    private List<T> objDisponiveis;

            public RentalService (List<T> objDisponiveis){
        this.objDisponiveis = objDisponiveis;
            }

    public T buscarObjDisponivel(){
        System.out.println("'''''''''''''''' Buscando Carro Disponivel -------");
        T t= objDisponiveis.remove(0);
        System.out.println("Alugando "+ t);
        System.out.println("Disponiveis ");
        System.out.println(objDisponiveis);
        return t;
    }

    public void retornarCarroAlugado(T t){
        System.out.println("Devolvendo " +t);
        objDisponiveis.add(t);
        System.out.println("Disponiveis para alugar ");
        System.out.println(objDisponiveis);
    }


}
