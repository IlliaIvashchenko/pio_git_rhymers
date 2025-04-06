package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer rozszerza DefaultCountingOutRhymer, implementując specyficzną logikę
 * dla problemu wież Hanoi. Odrzuca wartości, które są większe od aktualnie znajdującej się
 * na wierzchu stosu, zgodnie z zasadami gry.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INITIAL_REJECTED_COUNT = 0;
    protected int totalRejected = INITIAL_REJECTED_COUNT;

    /**
     * Zwraca liczbę odrzuconych wartości, które nie mogły być dodane do stosu
     * zgodnie z zasadami Hanoi.
     * 
     * @return całkowita liczba odrzuconych wartości
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje wartość do rhymera, ale odrzuca ją, jeśli jest większa od wartości na wierzchu stosu.
     * W przeciwnym razie dodaje wartość normalnie, jak w klasie bazowej.
     * 
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}