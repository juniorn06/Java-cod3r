package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.1f", imc);

    }
}
