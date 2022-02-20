package arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas serão informadas?: ");
        int qtdNotas = sc.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i ++){
            System.out.print("Nota #" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double total = 0;
        for (double nota : notas){
            total += nota;
        }

        System.out.println("Média do aluno: " + (total / qtdNotas));

        sc.close();
    }
}
