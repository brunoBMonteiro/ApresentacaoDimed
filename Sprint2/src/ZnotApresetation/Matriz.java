package ZnotApresetation;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos Alunos ? ");
        int qtdAlunos = entrada.nextInt();


        System.out.println("Quantas notas por aluno ? ");
        int qtddeNotas = entrada.nextInt();

        double [][] notasDaturma = new double[qtdAlunos][qtddeNotas];

            double total=0;
        for (int a = 0; a < notasDaturma.length ; a++) {
            for (int n = 0; n < notasDaturma[a].length; n++) {

                System.out.printf("Informe a nota %d do aluno %d :"
                                , n +1,a+1);
                notasDaturma[a][n] = entrada.nextDouble();

                total += notasDaturma[a][n];



            }
        }


        double media =total/qtdAlunos*qtddeNotas;
        System.out.println("Media da Turma é :"+media);

entrada.close();

    }

}
