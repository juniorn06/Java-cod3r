package oo.heranca.desafio;

public class Programa {

    public static void main(String[] args) {

        Civic civic  = new Civic();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        Ferrari ferrari = new Ferrari();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(civic.velocidadeAtual);
        System.out.println(ferrari.velocidadeAtual);

        civic.frear();
        ferrari.frear();

        System.out.println(civic.velocidadeAtual);
        System.out.println(ferrari.velocidadeAtual);


    }
}
