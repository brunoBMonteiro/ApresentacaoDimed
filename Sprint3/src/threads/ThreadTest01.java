package threads;


public class ThreadTest01 {
    //o que é ?
    // Pode ser um objeto pois tem uma classe chamada Thread
    // e pode ser um processo  (Sistema operacional)  divide a carga de processo do cpu
    // e o java cuida deste gerenciamento, e inicialização, pausa, e parar.


    // Dois Jeitos de Criar Threads
    // Primeiro

    // Criado um Objeto do Tipo Thread
    static class ThreadExample extends Thread {

        private final char c;

        public ThreadExample(char c) {
            this.c = c;
        }

        // e o codigo que voce quer que seja executando por treads diferentes tem que ir no metodo // thread difente


        @Override
        public void run() {
            //O nome é main não tem nada aver com o nome do metodo main
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 500; i++) {
                System.out.print(c);
                if (i % 100 == 0) {
                    System.out.println();
                }

            }
        }
    }

    // Segundo jeito de Criar Threads
    static class ThreadExeampleReunnble implements Runnable {

        private final char c;

        public ThreadExeampleReunnble(char c) {
            this.c = c;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 500; i++) {
                System.out.print(c);
                if (i % 100 == 0) {
                    System.out.println();
                }

            }
        }
    }


    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample('A');
        ThreadExample t2 = new ThreadExample('B');
        ThreadExample t3 = new ThreadExample('C');

        // Executando na mesma thread
        //t1.run();
        //t2.run();
        //t3.run();

        // Executando em threads diferentes
        // a sequencia é a jvm que escolhe a sequencia das treads

        // t1.start();
        // t2.start();
        // t3.start();

        //------------------------------------------------------------------------------------------------------

        // não tem garantia que é treads entao encapsula
        Thread t4 = new Thread(new ThreadExeampleReunnble('A'), "T1");
        Thread t5 = new Thread(new ThreadExeampleReunnble('B'), "T2");
        Thread t6 = new Thread(new ThreadExeampleReunnble('C'), "T3");

        // Executando na mesma thread
        //  t1.run();
        //  t2.run();
        //  t3.run();

        // Executando em threads diferentes
        // a sequencia é a jvm que escolhe a sequencia das treads
        t4.start();
        t5.start();
        t6.start();

        // não se pode startar a mesma thread novamente

        // apos Startar a thread quem decide se ela vai ser executada é a jvm e pode ir para Waiting ou dead

        // depois que a thread morre não tem como recupera- la


        // dps do runnuble quem cuida da thread é a jvm

        // a thead main nunca vai entrar nas threads apenas executa a tarefa do usuario

        // ou seja ela é finalizada e o programa continua rodando

        System.out.println("################## Execução da Main Finalizado ###################################### " + Thread.currentThread().getState());

    }


}
