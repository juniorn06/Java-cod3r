package controle;

import java.util.Scanner;

public class ExercicioSomaPositivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.print("Informe um número positivo: (0 ou negativo para sair)");
        int n = sc.nextInt();

        while (n >= 0){
            soma += n;
            System.out.println("\nA soma dos números informados é: " + soma);
            n = sc.nextInt();
        }
    }
}
