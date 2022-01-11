package generics.service;



import generics.dominio.Barco;


import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcoDisponiveis = new ArrayList<>(
            List.of(
                    new Barco("Canoa"),
                    new Barco("lancha")));



    public Barco buscarBarcoDisponivel(){
        System.out.println("'''''''''''''''' Buscando Barco Disponivel -------");
        Barco barco= barcoDisponiveis.remove(0);
        System.out.println("Alugando "+ barco);
        System.out.println("Disponiveis ");
        System.out.println(barcoDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo " +barco);
        barcoDisponiveis.add(barco);
        System.out.println("Disponiveis para alugar ");
        System.out.println(barcoDisponiveis);
    }




}
