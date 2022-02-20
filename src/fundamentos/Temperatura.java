package fundamentos;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //(ºF - 32) * 5/9 = ºC

        final double ajuste = 32.0;
        final double fator = 5.0 / 9.0;
        double f, c;

        System.out.print("Temperatura em Fahrenheit: ");
        f = sc.nextDouble();

        c = (f - ajuste) * fator;

        System.out.println("Temperatura em Celsius: " + c + "º");
    }
}
