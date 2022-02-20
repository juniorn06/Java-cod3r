package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

        Produto p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.printf(p1.nome + ": R$ %.2f\n", p1.precoComDesconto());
        System.out.printf(p2.nome + ": R$ %.2f\n", p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho: = R$%.2f", mediaCarrinho);

    }
}