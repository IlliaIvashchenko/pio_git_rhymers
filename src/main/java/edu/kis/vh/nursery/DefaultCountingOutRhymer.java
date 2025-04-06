package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer implementuje podstawową strukturę stosu (LIFO) do przechowywania
 * i zarządzania liczbami całkowitymi. Obsługuje operacje dodawania (countIn), wyciągania (countOut),
 * sprawdzania pustego stanu (callCheck), pełnego stanu (isFull) oraz podglądu wierzchołka (peekaboo).
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int MAX_INDEX = CAPACITY - 1;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int DEFAULT_RETURN_VALUE = -1;

    protected final int[] NUMBERS = new int[CAPACITY];
    protected int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Dodaje wartość do stosu, jeśli nie jest on pełny.
     * 
     * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     * 
     * @return true, jeśli stos jest pusty; w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     * 
     * @return true, jeśli stos jest pełny; w przeciwnym razie false
     */
    public boolean isFull() {
        return total == MAX_INDEX;
    }

    /**
     * Zwraca wartość z wierzchołka stosu bez jej usuwania.
     * 
     * @return wartość z wierzchołka stosu lub DEFAULT_RETURN_VALUE, jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return NUMBERS[total];
    }

    /**
     * Usuwa i zwraca wartość z wierzchołka stosu.
     * 
     * @return wartość z wierzchołka stosu lub DEFAULT_RETURN_VALUE, jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return NUMBERS[total--];
    }
}