package estruturaDeDados.composicao.umParaUm;

public class Carro {
    Motor motor =new Motor();

    void acelerar (){
        motor.fatorInjecao += 0.4;
    }

    void frear (){
        motor.fatorInjecao -= 0.4;
    }

    void ligar(){
        motor.ligado =true;
    }

    void desligado(){
        motor.ligado =false;
    }

    boolean estaligado(){


        return motor.ligado;
    }




}
