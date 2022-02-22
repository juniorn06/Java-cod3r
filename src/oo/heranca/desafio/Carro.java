package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;

    void acelerar(){
        velocidadeAtual += 5;
    }

    void frear(){
        if (velocidadeAtual > 5){
            velocidadeAtual -=5;
        }
    }

    //frear 5 em 5, não diminuir velocidade abaixo de 0
}

