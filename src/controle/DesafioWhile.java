package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int notaValida = 0;

        while (nota != -1){
            System.out.print("Informe o valor da nota (ou -1 p/ sair): ");
            nota = sc.nextDouble();

            if (nota >=0 && nota <= 10){
                total = nota + total;
                notaValida++;
            }
        }

        double media = total / notaValida;

        System.out.println("Notas válidas: " + notaValida);
        System.out.println("Média das notas: %.2f" + media);
    }
}
