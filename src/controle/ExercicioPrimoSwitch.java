package controle;

import java.util.Scanner;

public class ExercicioPrimoSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contadorDeDivisores = 0;

        System.out.print("Informe um número: ");
        int n = sc.nextInt();

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                contadorDeDivisores++;
            }
        }

        switch (contadorDeDivisores){
            case 0:
                System.out.println(" O número " + n + " é primo.");
            default:
                System.out.println("O número " + n + " não é primo.");
        }

    }
}

