package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv \"?: " + comprouTv50);
        System.out.println("Comprou Tv 32\"?: " + comprouTv32);
        System.out.println("Comprou Tv 32\" Sorvete?: " + comprouSorvete);

        System.out.println("Mais saudável? " + maisSaudavel);

    }
}
