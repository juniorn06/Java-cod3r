package fundamentos;

public class ConversaoTipoPrimitivoNumeroci {

    public static void main(String[] args) {

        double a = 1; // conversão implícita
        System.out.println(a);

        float b = (float) 1.12345; //conversão explícita (CAST)
        System.out.println(b);

        int c = 130;
        byte d = (byte) c; // explícita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e;
        System.out.println(f);
    }
}
