package estruturadedados;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Imforme a Quantidade de alunos : ");

        int aluno =0;
        double []alunos = new double[aluno];


        System.out.println("Informe a quantidade de notas que deseja");
       int qtdNotas= entrada.nextInt();
        double[] a = new double[qtdNotas];



        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite a sua nota "+i);
              a[i] = entrada.nextDouble();
            System.out.println(i);
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
         double soma=0.0;

        for (double i: a  ) {
             soma += i;
        }

        System.out.println(soma + "totalaq");
        System.out.println( "A média do aluno é : "+soma / a.length);
        System.out.println(a.length + " aquigg");
        }

    }




