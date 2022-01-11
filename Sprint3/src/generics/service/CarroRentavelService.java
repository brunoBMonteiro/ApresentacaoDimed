package generics.service;



import generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(
            List.of(
                    new Carro("Fiat"),
                    new Carro("Strada")));



    public Carro buscarCarroDisponivel(){
        System.out.println("'''''''''''''''' Buscando Carro Disponivel -------");
        Carro carro= carrosDisponiveis.remove(0);
        System.out.println("Alugando "+ carro);
        System.out.println("Disponiveis ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo " +carro);
        carrosDisponiveis.add(carro);
        System.out.println("Disponiveis para alugar ");
        System.out.println(carrosDisponiveis);
    }




}
