package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

/**
 * Klasa RhymersDemo demonstruje działanie różnych typów rhymerów
 * (StandardRhymer, FalseRhymer, FifoRhymer, HanoiRhymer) tworzonych
 * za pomocą fabryki RhymersFactory. Wykonuje operacje dodawania
 * i wyciągania wartości oraz wyświetla wyniki.
 */
class RhymersDemo {

    /**
     * Metoda główna programu. Inicjuje fabrykę rhymerów i wywołuje
     * metodę testRhymers z przekazaną fabryką.
     * 
     * @param args argumenty wiersza poleceń (nieużywane)
     */
    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        
        testRhymers(factory);
    }

    /**
     * Wykonuje testy na różnych typach rhymerów:
     * - Tworzy tablicę rhymerów za pomocą fabryki.
     * - Dodaje wartości do rhymerów.
     * - Wyciąga i wyświetla wartości z rhymerów.
     * - Wyświetla liczbę odrzuconych wartości dla HanoiRhymer.
     * 
     * @param factory fabryka rhymerów, z której pobierane są instancje rhymerów
     */
    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFifoRhymer(), factory.getHanoiRhymer()};
        
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
        
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));
        
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }
}