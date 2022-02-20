package controle;

import java.util.Scanner;

public class ExercicioNumeroPrimo {

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

        if (contadorDeDivisores == 0){
            System.out.println("\n O número " + n + " é primo");
        }
        else {
            System.out.println("\n O número " + n + " não é primo");
        }

        sc.close();
    }
}
