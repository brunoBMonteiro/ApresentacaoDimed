package notapresetation.composicao.umparaum;

public class CarroTest {
    public static void main(String[] args) {

        Carro c1 =new Carro();
       System.out.println(c1.estaligado());

      c1.ligar();

        System.out.println(c1.estaligado());

        c1.motor.giros();

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println(c1.motor.giros());

        //Faltou Encapsulamento
        c1.motor.fatorInjecao = -200;


        System.out.println(c1.motor.fatorInjecao);
    }
}
