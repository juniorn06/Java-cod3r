package lambdas;

@FunctionalInterface // define que uma interface funcional pode ter apenas uma única função
public interface Calculo {

    double executar(double a, double b);

    default String legal(){
        return "legal";
    }

    static String muitoLegal(){
        return "muito legal";
    }
}
