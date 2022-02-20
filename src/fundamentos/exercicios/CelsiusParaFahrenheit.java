package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double c = sc.nextDouble();

        double f = (1.8 * c) + 32;

        System.out.println("Temperatura em Fahrenheit: " + f);

    }
}
