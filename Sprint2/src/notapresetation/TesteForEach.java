package notapresetation;

import java.util.Arrays;

public class TesteForEach {



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
           // for (int i = 0; i < a.length; i++) {

          //      total += a[i];
            //    System.out.println(total/a.length);
               // System.out.println(total + "aqui2");
               // System.out.println(a.length+"aqui 3");

          //  }



            for (double h:a ) {

                total += h;
                System.out.println(total+ "totalaq");
               System.out.println(total/a.length + "aquigg");
                System.out.println(a.length+" aquigg");

            //    System.out.println(h + "Valor do array");

            }




            double b[] = {4,5};
            double totalb=0;
            for (int i = 0; i < b.length; i++) {
                totalb+= b[i];
                System.out.println(totalb/b.length);
            }

        }





    }



