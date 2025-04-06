package edu.kis.vh.nursery.list;

/**
 * Klasa Node reprezentuje pojedynczy węzeł w dwukierunkowej liście powiązanej.
 * Przechowuje wartość typu int oraz odniesienia do poprzedniego i następnego węzła.
 */
public class Node {

    /** Wartość przechowywana w węźle, ustawiana podczas tworzenia obiektu */
    private final int value;
    
    /** Odniesienie do poprzedniego węzła w liście */
    private Node prev;
    
    /** Odniesienie do następnego węzła w liście */
    private Node next;

    /**
     * Konstruktor inicjuje węzeł z podaną wartością.
     * 
     * @param i wartość do przechowywania w węźle
     */
    public Node(int i) {
        this.value = i;
    }

    /**
     * Zwraca wartość przechowywaną w węźle.
     * 
     * @return wartość węzła
     */
    public int getValue() {
        return value;
    }

    /**
     * Zwraca odniesienie do poprzedniego węzła w liście.
     * 
     * @return poprzedni węzeł lub null, jeśli nie istnieje
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Ustawia odniesienie do poprzedniego węzła.
     * 
     * @param prev węzeł, który ma być ustawiony jako poprzedni
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Zwraca odniesienie do następnego węzła w liście.
     * 
     * @return następny węzeł lub null, jeśli nie istnieje
     */
    public Node getNext() {
        return next;
    }

    /**
     * Ustawia odniesienie do następnego węzła.
     * 
     * @param next węzeł, który ma być ustawiony jako następny
     */
    public void setNext(Node next) {
        this.next = next;
    }
}