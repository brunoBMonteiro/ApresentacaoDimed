package notapresetation;

import java.util.Arrays;

public class ArrayConceito {
    // estrutura estatica // tem tamanho fixo
    // é homogeneo tem apenas um tipo // ex int serão todos inteiros;
    // indexada
    // array é um objeto

    // criação de array
    public static void main(String[] args) {


        double[] a = new double[2];
           
        // add elemento por elemento
        a[0] = 100.0;
        a[1] = 100.0;
        //não pode por seu o ponteiro do array
        //a[2] = 100.0;

        System.out.println(a[0]);

        System.out.println(Arrays.toString(a));

        // acessa o array
        //System.out.println( -> a.);

        // acessa a posição do array
        //System.out.println( -> a[0].);



        // percorrer array


        double total=0;
        for (int i = 0; i < a.length; i++) {

            total += a[i];
            System.out.println(total/a.length);

        }


        double b[] = {4,5};
        double totalb=0;
        for (int i = 0; i < b.length; i++) {
            totalb+= b[i];
            System.out.println(totalb/b.length);
        }

    }

/*
    ArrayList and Vector both implements List interface and maintains insertion order.But there are many differences between ArrayList and Vector classes...

    ArrayList -

    ArrayList is not synchronized.
    ArrayList increments 50% of current array size if number of element exceeds from its capacity.
    ArrayList is not a legacy class, it is introduced in JDK 1.2.
    ArrayList is fast because it is non-synchronized.
    ArrayList uses Iterator interface to traverse the elements.

    Vector -

    Vector is synchronized.
    Vector increments 100% means doubles the array size if total number of element exceeds than its capacity.
    Vector is a legacy class.
    Vector is slow because it is synchronized i.e. in multithreading environment,
    it will hold the other threads in runnable or non-runnable state until current thread releases the lock of object.
    Vector uses Enumeration interface to traverse the elements. But it can use Iterator also.

    */





}
