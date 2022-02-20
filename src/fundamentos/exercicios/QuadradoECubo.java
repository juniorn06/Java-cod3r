package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoECubo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double n = sc.nextDouble();

        double quadrado = Math.pow(n, 2);
        double cubo = Math.pow(n, 3);

        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);
    }
}
