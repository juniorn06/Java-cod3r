package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    String nome;
    double preco;

    List<Item> itens = new ArrayList<>();

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
