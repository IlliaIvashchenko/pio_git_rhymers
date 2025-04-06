package edu.kis.vh.nursery.list;

/**
 * Klasa IntLinkedList implementuje prostą listę powiązaną przechowującą liczby całkowite.
 * Lista jest jednokierunkowa i działa na zasadzie LIFO (Last In, First Out).
 * Obsługuje operacje dodawania (push), wyciągania (pop), podglądu wierzchołka (top),
 * oraz sprawdzenia, czy lista jest pusta (isEmpty) lub pełna (isFull).
 */
public class IntLinkedList {

    /** Stała zwracana przez metody top() i pop(), gdy lista jest pusta. */
    public static final int DEFAULT_RETURN_VALUE = -1;

    /** Wskaźnik na ostatni węzeł listy. */
    private Node last;
    
    /** Zmienna nieużywana w implementacji; zachowana dla zgodności. */
    private int i;

    /**
     * Dodaje nową wartość na koniec listy (wierzchołek stosu).
     * 
     * @param i wartość do dodania
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza, czy lista jest pusta.
     * 
     * @return true, jeśli lista jest pusta; w przeciwnym razie false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy lista jest pełna. Ponieważ jest to lista powiązana, nigdy nie jest pełna.
     * 
     * @return false, lista nigdy nie jest pełna
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość z wierzchołka listy bez jej usuwania.
     * 
     * @return wartość z wierzchołka listy lub DEFAULT_RETURN_VALUE, jeśli lista jest pusta
     */
    public int top() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        return last.getValue();
    }

    /**
     * Usuwa i zwraca wartość z wierzchołka listy.
     * 
     * @return wartość z wierzchołka listy lub DEFAULT_RETURN_VALUE, jeśli lista jest pusta
     */
    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}