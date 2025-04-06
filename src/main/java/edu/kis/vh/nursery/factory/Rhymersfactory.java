package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

/**
 * Interfejs Rhymersfactory definiuje fabrykę do tworzenia różnych wariantów klasy DefaultCountingOutRhymer.
 * Każdy wariant może implementować specyficzną logikę lub zachowanie, takie jak standardowe liczenie,
 * wariant fałszywy, działanie oparte na FIFO lub zgodność z zasadami wież Hanoi.
 */
public interface Rhymersfactory {

    /**
     * Zwraca standardową implementację rhymera.
     * 
     * @return obiekt DefaultCountingOutRhymer o standardowym zachowaniu liczenia
     */
    public DefaultCountingOutRhymer getStandardRhymer();

    /**
     * Zwraca rhymer, który może wykazywać niestandardowe lub fałszywe zachowanie,
     * potencjalnie do celów testowych lub specyficznych przypadków użycia.
     * 
     * @return obiekt DefaultCountingOutRhymer o fałszywym zachowaniu
     */
    public DefaultCountingOutRhymer getFalseRhymer();

    /**
     * Zwraca rhymer implementujący zachowanie FIFO (First In, First Out),
     * gdzie najstarsze dodane wartości są usuwane jako pierwsze.
     * 
     * @return obiekt DefaultCountingOutRhymer o zachowaniu FIFO
     */
    public DefaultCountingOutRhymer getFifoRhymer();

    /**
     * Zwraca rhymer, który przestrzega zasad problemu wież Hanoi,
     * gdzie wartości są dodawane i usuwane zgodnie z określonymi ograniczeniami.
     * 
     * @return obiekt DefaultCountingOutRhymer o zachowaniu zgodnym z Hanoi
     */
    public DefaultCountingOutRhymer getHanoiRhymer();
}