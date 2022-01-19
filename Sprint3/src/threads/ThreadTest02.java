package threads;

//Prioty //Sleep

public class ThreadTest02 {
    static class ThreadExample extends Thread{

        private final char c;

        public ThreadExample(char c){
            this.c =c;
        }
        @Override
        public void run() {
            //O nome é main não tem nada aver com o nome do metodo main
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 500; i++) {
                System.out.print(c);
                if(i % 100 == 0){
                    System.out.println();
                }

            }
        }
    }

    static class  ThreadExeampleReunnble implements Runnable{

            private final char c;
            public ThreadExeampleReunnble(char c){
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

                // As x tem que usar a thread para consultar a api,
                // e ai tem que ter algo para não ficar consultando a todo momento sobrecarregando a api
                // è estatica
                // Precisa do TryCach, pois se não dormir da uma Exeptions



                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
        }
    public static void main(String[] args) {



        Thread t1 = new Thread (new ThreadExeampleReunnble('A'),"T1");
        Thread t2 = new Thread (new ThreadExeampleReunnble('B'),"T2");
        Thread t3 = new Thread (new ThreadExeampleReunnble('C'),"T3");



       // Tenta dar prioridade para essta thread, mas não é garatido
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


        System.out.println("################## Execução da Main Finalizado ###################################### "+Thread.currentThread().getName());


    }




}
