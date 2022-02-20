package controle;

import java.util.Random;
import java.util.Scanner;

public class ExercicioAdivinhacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int aleatorio = random.nextInt(100) + 1;
        int chances = 10;

        System.out.print("Adivinhe o número sorteado: ");
        int numero = sc.nextInt();

        for (int i = 0; i < 10; i ++){
            if (numero == aleatorio){
                System.out.println("Parabéns! O número sorteado é " + aleatorio);
                break;
            }

            else if (numero > aleatorio){
                System.out.println("O número sorteado é menor que " + numero + " . Restam " + chances + " chances." );
            }
            else {
                System.out.println("O número sorteado é maior que " + numero + " . Restam " + chances + " chances." );
            }

            numero = sc.nextInt();
            chances --;

        }
        

        sc.close();
    }
}
