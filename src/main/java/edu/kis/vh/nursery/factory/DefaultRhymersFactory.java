package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Klasa DefaultRhymersFactory implementuje interfejs Rhymersfactory, dostarczając konkretne
 * warianty klasy DefaultCountingOutRhymer. Każda metoda zwraca inną implementację rhymera,
 * taką jak standardową, fałszywą, FIFO lub zgodną z zasadami wież Hanoi.
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    /**
     * Zwraca standardową implementację rhymera.
     * 
     * @return nowy obiekt DefaultCountingOutRhymer o standardowym zachowaniu
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Zwraca rhymer o fałszywym zachowaniu, który w tej implementacji jest taki sam
     * jak standardowy rhymer.
     * 
     * @return nowy obiekt DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Zwraca rhymer implementujący zachowanie FIFO (First In, First Out).
     * 
     * @return nowy obiekt FifoRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFifoRhymer() {
        return new FifoRhymer();
    }

    /**
     * Zwraca rhymer zgodny z zasadami problemu wież Hanoi.
     * 
     * @return nowy obiekt HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}