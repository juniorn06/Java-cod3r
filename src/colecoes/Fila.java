package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Adicionam elementos na fila
        // A diferença é o comportamento que ocorre quando a fila está cheia.

        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Obtém o próximo elemento da fila (Sem remover)
        // A diferença é o comportamento que ocorre quando a fila está cheia.

        System.out.println(fila.peek());  // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //Lança uma exceção
        System.out.println(fila.element());

        // Pool e Remove -> Obtêm o próximo elemento da fila e o remove
        // A diferença é o comportamento que ocorre quando a fila está cheia.

        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // lança uma exceção

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(....);

    }
}
