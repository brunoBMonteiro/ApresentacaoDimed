package threads.sincronismo.test;

import threads.sincronismo.dominio.Conta;

import java.util.concurrent.Semaphore;

public class ThreadAccountTest01 implements  Runnable{
            // se nçao criar como final, pois pode criar ou outro objeto assim não sabe quem vai dar lock
    private final Conta conta = new Conta();

    public static void main(String[] args) {
        // Cria uma Trhead e Separa em duas
        // o Lock é pra este objeto
ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
Thread t1 = new Thread(threadAccountTest01,"Maria");
Thread t2 = new Thread(threadAccountTest01,"Joao");
t1.start();
t2.start();

         Semaphore semaphoreConsumer = new Semaphore(0);

         Semaphore semaphoreProducer = new Semaphore(1);


    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
            if(conta.getBalance() <0){
                System.out.println("Fodeo");

            }

        }
    }
    // Problema de Sincronismo
    // Este pedaço de codigo precise ser executado de forma atomica (Quer dizer que uma thread tem que exectuar todo cod pra depois liberar para outra thread)
    // assim todo o objeto tem o lock - o lock é uma chave que se tem no objeto,se uma thread pelgar este lock não vai comseguir executar outro objeto
    // apos colocar o syn, o method deixa de ter paralelismo

    private  /*synchronized*/ void withdrawl(int amount){

        // pode synconizar apenas o objeto
        System.out.println(getThreadName()+ "####  Fora do Syncronized");
        synchronized (conta) {
            System.out.println(getThreadName()+"***** Dentro do Syncronized");
            if (conta.getBalance() >= amount) {
                System.out.println(getThreadName() + "Esta indo sacar o dinheiro");
                conta.withdrawç(amount);


      /* // sleep não solta o lock
       try {
           Thread.sleep(1000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
// apos terminar o lock ele pode pegar o mesmo obj novamente, isso é da jvm
*/


                System.out.println(getThreadName() + "Completou o saque, valor atual da conta ->" + conta.getBalance());
            } else {
                System.out.println("Sem Dinheiro para " + getThreadName() + " efetuar o saque " + conta.getBalance());

            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }


}
