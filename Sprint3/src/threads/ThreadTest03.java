package threads;

// Yield e Join

// Yield
  // è um metodo que foi criado dar uma pausa,
// ou seja ele da uma indicação para a jvm voltar para Runnable
// e a Jvm é livre para ignorar esta instrução tbm se quiser


    class  ThreadExeampleReunnble3 implements Runnable{

            private final String c;
            public ThreadExeampleReunnble3(String c){
                this.c =c;
            }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 500; i++) {
                System.out.print(c);
                if(i % 100 == 0){
                    System.out.println();
                }

                Thread.yield();
                // saida kamekamekame
            }


        }

     }

public class ThreadTest03 {                     // add exeption

                                                 // Exetion das Threads, que cuida para não quebrar o fluxo de espera,dormir ou qualquer outra que interrompa a execução
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new ThreadExeampleReunnble3("KA"));
        Thread t2 = new Thread(new ThreadExeampleReunnble3("ME"));
       // t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        //Executa apenas a t1 primeiro, depois a Thread 2
        t1.join();
        t2.start();



    }




}
