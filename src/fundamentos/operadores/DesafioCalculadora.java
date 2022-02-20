package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Informe a operação: ");
        String op = sc.nextLine();



        sc.close();

    }
}
