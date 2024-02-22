package Pilas;

import Interfaces.UVGList;

public class ListaSimpleImplementacion<G> implements UVGList<G> {
    public Node<G> head; // Cambio de visibilidad a public

    public static class Node<G> { // Cambio de visibilidad a public
        G data;
        Node<G> next;

        Node(G data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void add(G item) {
        Node<G> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<G> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public G remove() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        G data = head.data;
        head = head.next;
        return data;
    }

    @Override
    public G get() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
}
