package oo.desafio;

public class Programa {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Tagima JA 1", 7200.0, 1);
        compra1.adicionarItem(new Produto("Takamine Gd30", 3800.0), 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Palhetas Dunlop",5.00, 2);
        compra2.adicionarItem(new Produto("Encordoamento Elixir", 150.0), 1);

        Cliente cliente = new Cliente("Junior");
        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
