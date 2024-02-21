package Pilas;

public interface UVGList<G> {
    void add(G item);
    G remove();
    G get();
    boolean isEmpty();
}
