package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String n1 = sc.nextLine().replace(",", ".");
        String n2 = sc.nextLine().replace(",", ".");
        String n3 = sc.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(n1);
        double salario2 = Double.parseDouble(n2);
        double salario3 = Double.parseDouble(n3);

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;

        System.out.printf("Soma dos salários: R$ %.2f\n", soma);
        System.out.printf("Média dos salários: R$ %.2f", media);

    }
}
