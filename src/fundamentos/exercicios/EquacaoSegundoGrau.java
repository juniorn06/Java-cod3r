package fundamentos.exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de a: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de b: ");
        int b = sc.nextInt();
        System.out.print("Informe o valor de c: ");
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);

        System.out.println("\nO delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f" ,x2);
    }
}
