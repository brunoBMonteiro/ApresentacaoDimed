package generics.test;

import generics.dominio.Barco;
import generics.dominio.Carro;
import generics.service.BarcoRentavelService;
import generics.service.RentalService;

public class ClassGenericsTest01 {

    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o Barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);








    }
}
