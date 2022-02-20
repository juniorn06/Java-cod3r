package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) / 1.8;

        System.out.println("Temperatura em celsius: " + c);

    }
}
