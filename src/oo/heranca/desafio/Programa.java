package oo.heranca.desafio;

public class Programa {

    public static void main(String[] args) {

        Civic civic  = new Civic(200);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        Carro ferrari = new Ferrari(350);

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

    }
}
