package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String p1 = "";

        while (!p1.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            p1 = sc.nextLine();
        }

        sc.close();
    }
}
