package generics.test;

import generics.dominio.Barco;
import generics.dominio.Carro;
import generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericsTest02 {

    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(
                        new Carro("Fiat"),
                        new Carro("Strada")));
        List<Barco> barcoDisponiveis = new ArrayList<>(
                List.of(
                        new Barco("Canoa"),
                        new Barco("lancha")));

        RentalService<Barco> rentalService = new RentalService<>(barcoDisponiveis);
        Barco barco = rentalService.buscarObjDisponivel();
        System.out.println("Usando o Barco por um mês...");
        rentalService.retornarCarroAlugado(barco);

        System.out.println("---------------------------------------Carro---------------");

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = carroRentalService.buscarObjDisponivel();
        System.out.println("Usando o Barco por um mês...");
        carroRentalService.retornarCarroAlugado(carro);









    }









}
