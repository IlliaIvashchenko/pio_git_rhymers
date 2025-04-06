package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

/**
 * Klasa testowa JUnit dla klasy DefaultCountingOutRhymer.
 * Zawiera testy jednostkowe weryfikujące poprawność działania metod takich jak
 * countIn, callCheck, isFull, peekaboo oraz countOut.
 */
public class RhymersJUnitTest {

    /**
     * Weryfikuje, czy metoda countIn poprawnie dodaje wartość do rhymera
     * oraz czy wartość ta może być odzyskana za pomocą peekaboo bez jej usuwania.
     */
    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    /**
     * Testuje metodę callCheck, aby upewnić się, że poprawnie wskazuje,
     * czy rhymer jest pusty. Sprawdza, czy zwraca true, gdy jest pusty,
     * i false po dodaniu wartości.
     */
    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    /**
     * Testuje metodę isFull, wypełniając rhymer do jego pojemności i weryfikując,
     * czy isFull zwraca false, dopóki pojemność nie zostanie osiągnięta, a następnie true.
     */
    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    /**
     * Testuje metodę peekaboo, aby upewnić się, że zwraca poprawną wartość bez jej usuwania.
     * Weryfikuje zachowanie, gdy rhymer jest pusty oraz gdy zawiera wartości.
     */
    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    /**
     * Testuje metodę countOut, aby zweryfikować, czy poprawnie usuwa i zwraca wartości.
     * Sprawdza zachowanie, gdy rhymer jest pusty oraz po dodaniu i usunięciu wartości.
     */
    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }
}