package fundamentos.operadores;

public class Unarios {

    public static void main(String[] args) {

        int a  = 1;
        int b = a;

        a++; // incremento
        a--; // decremento

        ++b;
        --b;

        System.out.println("Mini desafio");
        System.out.println(a++ == b--);
        System.out.println(a);
        System.out.println(b);
    }
}
