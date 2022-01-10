package stream.test.parallelstreams;

import java.util.stream.LongStream;
import java.util.stream.Stream;
// cenario de uso - otimização

// quando se deve usar
     // - verificar o banchmark, e ver se realmente é util
     // - box e unbox
     // - se dividir uma tarefa mt piquena não vale apena pois pode mais adicionar processamento do que tirar

public class StreamTest16 {
    public static void main(String[] args) {
        // num cpus
        System.out.println(Runtime.getRuntime().availableProcessors());
        // quanto mais cpus + processamento paralelo se tem

        long num = 10_000_000;
            sumFor(num);
            sumStreamIterate(num);
            sumParallelStreamInterate(num);
            sumLongStream(num);
            sumLongStreamParallel(num);
    }


    private static void sumFor(long num){
        System.out.println("Sum For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            result +=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " "+(end - init) + "ms");

    }



    //box autobox
    private static void sumStreamIterate(long num){
        System.out.println("Sum Stream Iterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " "+(end - init) + "ms");

    }


     //pode chamar o Parallel() qualquer lugar // é apenas uma flag
     // 1,2,3,4,5,6,7,8,9  //trab
    private static void sumParallelStreamInterate(long num){
        System.out.println("sum Parallel Stream Interate");
        long init = System.currentTimeMillis();
                                        // interate 1 por 1 ai é mais lento
        Long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " "+(end - init) + "ms");

    }


    //

    private static void sumLongStream(long num){
        System.out.println("sum Long Stream");
        long init = System.currentTimeMillis();
        // aqui ja define quantos valores tem
        // assim ja é dividito antecipadadmente e passado para as threads
        // sem box e unbox
        Long result = LongStream.rangeClosed(1L,num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " "+(end - init) + "ms");
    }


    // parallel
    private static void sumLongStreamParallel(long num){
        System.out.println("sum Long Stream Parallel");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L,num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " "+(end - init) + "ms");
    }

}
